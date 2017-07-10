package com.example.myeongsic.howlfirebaseauth;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by myeongsic on 2017. 6. 20..
 */

public class ImageDTO {


    public String imageUrl;
    public String imageName;
    public String title;
    public String description;
    public String uid;
    public String userId;
    public int starCount = 0;
    public Map<String, Boolean> stars = new HashMap<>();

}
