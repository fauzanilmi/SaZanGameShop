package com.example.fauzanersan.sazangameshop.product;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

import com.example.fauzanersan.sazangameshop.R;
import com.example.fauzanersan.sazangameshop.fragments.ImageListFragment;
import com.example.fauzanersan.sazangameshop.fragments.ViewPagerActivity;
import com.example.fauzanersan.sazangameshop.notification.NotificationCountSetClass;
import com.example.fauzanersan.sazangameshop.options.CartListActivity;
import com.example.fauzanersan.sazangameshop.startup.MainActivity;
import com.example.fauzanersan.sazangameshop.utility.ImageUrlUtils;

public class ItemDetailsActivity extends AppCompatActivity {
    int imagePosition;
    String stringImageUri;
    String itemPrice, itemName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_item_details);
        SimpleDraweeView mImageView = findViewById(R.id.image1);
        TextView textViewAddToCart = (TextView)findViewById(R.id.text_action_bottom1);
        TextView textViewBuyNow = (TextView)findViewById(R.id.text_action_bottom2);
        TextView itemPricetv = findViewById(R.id.itemPrice_detail);
        TextView itemNametv = findViewById(R.id.itemName_detail);
        LinearLayout linearLayoutWishlist = findViewById(R.id.layout_action3_detail);
        final ImageView iv_wishlist = findViewById(R.id.img_wishlist_detail);

        //Getting image uri from previous screen
        if (getIntent() != null) {
            stringImageUri = getIntent().getStringExtra(ImageListFragment.STRING_IMAGE_URI);
            imagePosition = getIntent().getIntExtra(ImageListFragment.STRING_IMAGE_URI,0);
            itemPrice = getIntent().getStringExtra("itemPrice");
            itemName = getIntent().getStringExtra("itemName");

        }

        itemNametv.setText(itemName);
        itemPricetv.setText("Rp. " + itemPrice);

        Uri uri = Uri.parse(stringImageUri);
        mImageView.setImageURI(uri);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(ItemDetailsActivity.this, ViewPagerActivity.class);
                    intent.putExtra("position", imagePosition);
                    startActivity(intent);

            }
        });

        textViewAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                imageUrlUtils.addCartListImageUri(stringImageUri, itemName, itemPrice);
                Toast.makeText(ItemDetailsActivity.this,"Item added to cart.",Toast.LENGTH_SHORT).show();
                MainActivity.notificationCountCart++;
                NotificationCountSetClass.setNotifyCount(MainActivity.notificationCountCart);
            }
        });

        textViewBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                imageUrlUtils.addCartListImageUri(stringImageUri, itemName, itemPrice);
                MainActivity.notificationCountCart++;
                NotificationCountSetClass.setNotifyCount(MainActivity.notificationCountCart);
                Intent intent = new Intent(ItemDetailsActivity.this, CartListActivity.class);
                intent.putExtra("itemName", itemName);
                intent.putExtra("itemPrice", itemPrice);
                startActivity(intent);

            }
        });

        linearLayoutWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageUrlUtils imageUrlUtils = new ImageUrlUtils();
                imageUrlUtils.addWishlistImageUri(stringImageUri);
                iv_wishlist.setImageResource(R.drawable.ic_favorite_black_18dp);
                Toast.makeText(ItemDetailsActivity.this, "Item added to wishlist.",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
