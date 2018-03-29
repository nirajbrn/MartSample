package com.android.ahivaran.data.gson;


import com.android.ahivaran.data.entity.ResponseEntity;
import com.android.ahivaran.data.gson.GsonFactory;

import junit.framework.Assert;

import org.junit.Test;

public class GsonUnitTest {
    @Test
    public void productGson() {
        GsonFactory.build();
        ResponseEntity responseEntity = GsonFactory.getInstance().fromJson(getProductJsonData(), ResponseEntity.class);
        Assert.assertEquals(responseEntity.getProductEntity().getId(), "82182");
        Assert.assertEquals(responseEntity.getProductEntity().getDescription(), "Avocado is a lush fruit with bright green flesh from the tropics.Varieties range from round to pear-shaped with skin ranging incolour from black to green and smooth to dimpler.");
        Assert.assertEquals(responseEntity.getProductEntity().getTitle(), "Mexican Airflown Avocados");
        Assert.assertEquals(responseEntity.getProductEntity().getImg().getImgUrlPath(), "/i/m/88864581052980021_1477382140953.jpg");
    }

    @Test
    public void categoryGson() {
        GsonFactory.build();
        ResponseEntity responseEntity = GsonFactory.getInstance().fromJson(getCategoryJsonData(), ResponseEntity.class);
        Assert.assertEquals(responseEntity.getPage(), 0);
        Assert.assertEquals(responseEntity.getPageSize(), 20);
        Assert.assertEquals(responseEntity.getTotal(), 120233);
        Assert.assertEquals(responseEntity.getProducts().get(0).getTitle(), "Australian Broccoli");
        Assert.assertEquals(responseEntity.getProducts().get(0).getDescription(), "Product of Australia. Versatile broccoli is delicious raw or cooked, and it is packed with so many complex nutrients that it's often called a superfood.");
        Assert.assertEquals(responseEntity.getProducts().get(0).getId(), "33973");
        Assert.assertEquals(responseEntity.getProducts().get(0).getPricing().getPrice(), "2.6");
        Assert.assertEquals(responseEntity.getProducts().get(0).getImg().getImgUrlPath(), "/i/m/8885003328014_0005_1520495600715.jpg");
    }

    private String getCategoryJsonData() {
        return "{\n" +
                "  \"products\": [\n" +
                "    {\n" +
                "      \"id\": 33973,\n" +
                "      \"title\": \"Australian Broccoli\",\n" +
                "      \"desc\": \"Product of Australia. Versatile broccoli is delicious raw or cooked, and it is packed with so many complex nutrients that it's often called a superfood.\",\n" +
                "      \"sku\": \"8885003328014\",\n" +
                "      \"categories\": [\n" +
                "        243,\n" +
                "        246,\n" +
                "        5981,\n" +
                "        5976,\n" +
                "        3277,\n" +
                "        5325,\n" +
                "        3450,\n" +
                "        3455,\n" +
                "        9297,\n" +
                "        11045,\n" +
                "        11272,\n" +
                "        11594,\n" +
                "        10490,\n" +
                "        12561,\n" +
                "        12612,\n" +
                "        9023,\n" +
                "        12654\n" +
                "      ],\n" +
                "      \"types\": [\n" +
                "        1741,\n" +
                "        5982,\n" +
                "        5393,\n" +
                "        5977,\n" +
                "        5980,\n" +
                "        5979,\n" +
                "        5334,\n" +
                "        6513,\n" +
                "        9298\n" +
                "      ],\n" +
                "      \"details\": {\n" +
                "        \"prod_type\": 0,\n" +
                "        \"uri\": \"australian-broccoli-33973\",\n" +
                "        \"status\": 1,\n" +
                "        \"is_new\": 0.0,\n" +
                "        \"storage_class\": \"Fresh2-5\",\n" +
                "        \"country_of_origin\": \"Australia\"\n" +
                "      },\n" +
                "      \"product_life\": {\n" +
                "        \"time\": 5,\n" +
                "        \"metric\": \"D\",\n" +
                "        \"is_minimum\": true,\n" +
                "        \"time_including_delivery\": 6\n" +
                "      },\n" +
                "      \"filters\": {\n" +
                "        \"mfr_name\": \"Cultured Greens\",\n" +
                "        \"trending_frequency\": 6784,\n" +
                "        \"is_organic\": 0,\n" +
                "        \"country_of_origin\": \"Australia\",\n" +
                "        \"vendor_name\": \"CultGrn\",\n" +
                "        \"brand_name\": \"Australian\",\n" +
                "        \"brand_uri\": \"australian\",\n" +
                "        \"frequency\": 41766,\n" +
                "        \"festive_bbq\": \"Vegetables & Mushrooms\",\n" +
                "        \"potluck\": \"Vegetables\"\n" +
                "      },\n" +
                "      \"img\": {\n" +
                "        \"h\": 0,\n" +
                "        \"w\": 0,\n" +
                "        \"name\": \"/i/m/8885003328014_0005_1520495600715.jpg\",\n" +
                "        \"position\": 0\n" +
                "      },\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"h\": 0,\n" +
                "          \"w\": 0,\n" +
                "          \"name\": \"/i/m/8885003328014_0005_1520495600715.jpg\",\n" +
                "          \"position\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"h\": 0,\n" +
                "          \"w\": 0,\n" +
                "          \"name\": \"/i/m/8885003328014_0006_1520495611293.jpg\",\n" +
                "          \"position\": 1\n" +
                "        }\n" +
                "      ],\n" +
                "      \"measure\": {\n" +
                "        \"wt_or_vol\": \"300 g\",\n" +
                "        \"size\": 0.0\n" +
                "      },\n" +
                "      \"pricing\": {\n" +
                "        \"on_sale\": 0,\n" +
                "        \"price\": 2.6,\n" +
                "        \"promo_price\": 0.0,\n" +
                "        \"savings_type\": 0\n" +
                "      },\n" +
                "      \"warehouse\": {\n" +
                "        \"measure\": {\n" +
                "          \"vol_metric\": \"\",\n" +
                "          \"wt\": 300.0,\n" +
                "          \"wt_metric\": \"g\",\n" +
                "          \"l\": 0.0,\n" +
                "          \"w\": 0.0,\n" +
                "          \"h\": 0.0\n" +
                "        }\n" +
                "      },\n" +
                "      \"attributes\": {\n" +
                "        \"dag\": []\n" +
                "      },\n" +
                "      \"description_fields\": {\n" +
                "        \"secondary\": [\n" +
                "          {\n" +
                "            \"name\": \"Storage Guidelines\",\n" +
                "            \"content\": \"Recommended to store at chilled temperature:1-3 degrees is highly perishable and should be transferred to cool storage immediately. Reduce stocking and practice good stock rotation to maintain freshness. Prolonged storage is not recommended.\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"primary\": [\n" +
                "          {\n" +
                "            \"name\": \"Delivery & Handling\",\n" +
                "            \"content\": \"Guaranteed Fresh, or get your money back.We take great pride in the quality of our fresh foods, so we guarantee your satisfaction with every product, every time.Our fruit & vegetables are delivered fresh on demand, to RedMart by approved suppliers and only the best of the bunch are hand-picked by our certified pickers, before being delivered directly to your door.  We skip the supermarket so your food arrives fresher without being poked by 50 pairs of curious hands.All of our fresh fruit & vegetables are stored in chilled, temperature controlled environments, which is maintained in our specially-lined totes, so your produce arrives as cool as a cumumber, from our door to yours.We guarantee to deliver the optimum freshness for each item, often far fresher than our competitors.  Start counting the freshness days on the day you get your delivery.  Our produce is best enjoyed within the number of days stated on the product page above.  Please note that this is only the minimum guarantee - with appropriate food storage, you may enjoy longer freshness days.If you are not satisfied with your fresh Fruit & Veg in any way, please fill up the simple form by going to: Help>Self Service Support Centre with the required information, within 2 days of delivery, and we will give you your money back.\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Country of Origin\",\n" +
                "            \"content\": \"Australia\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"max_days_on_shelf\": 10,\n" +
                "      \"inventory\": {\n" +
                "        \"atp_status\": 1,\n" +
                "        \"max_sale_qty\": 48,\n" +
                "        \"qty_in_carts\": 0,\n" +
                "        \"qty_in_stock\": 48,\n" +
                "        \"stock_status\": 1,\n" +
                "        \"stock_type\": 0,\n" +
                "        \"atp_lots\": [\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T16:02:13Z\",\n" +
                "            \"to_date\": \"2018-03-29T15:59:59Z\",\n" +
                "            \"stock_status\": 0,\n" +
                "            \"qty_in_stock\": 0,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T16:02:13Z\",\n" +
                "            \"to_date\": \"2018-03-30T15:59:59Z\",\n" +
                "            \"stock_status\": 0,\n" +
                "            \"qty_in_stock\": 0,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T16:02:13Z\",\n" +
                "            \"to_date\": \"2018-03-31T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 382,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T16:02:13Z\",\n" +
                "            \"to_date\": \"2018-04-01T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 480,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-30T07:00:00Z\",\n" +
                "            \"to_date\": \"2018-04-03T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 284,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-04-05T03:00:00Z\",\n" +
                "            \"to_date\": \"2018-05-03T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 100000,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          }\n" +
                "        ],\n" +
                "        \"next_available_date\": \"2018-03-27T16:02:13Z\",\n" +
                "        \"limited_stock_status\": 0\n" +
                "      },\n" +
                "      \"pr\": 1\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 21286,\n" +
                "      \"title\": \"RedMart Strong and Absorbent Kitchen Towels\",\n" +
                "      \"desc\": \"RedMart Multi Purpose Kitchen Towels are high-quality, responsibly sourced kitchen towels. They are strong and absorbent - ideal for cleaning, drying and removing grease. This paper is FSC certified to ensure a responsible and sustainable management of the worlds forests . This paper contains no optical brightening agents , that can cause skin irritation.\",\n" +
                "      \"sku\": \"9555672908877\",\n" +
                "      \"categories\": [\n" +
                "        6,\n" +
                "        265,\n" +
                "        3450,\n" +
                "        3494,\n" +
                "        265,\n" +
                "        6592,\n" +
                "        6928,\n" +
                "        6932,\n" +
                "        10490,\n" +
                "        10407,\n" +
                "        11236,\n" +
                "        11611\n" +
                "      ],\n" +
                "      \"types\": [\n" +
                "        1869,\n" +
                "        3496,\n" +
                "        3262,\n" +
                "        6633,\n" +
                "        12815,\n" +
                "        6877,\n" +
                "        10414\n" +
                "      ],\n" +
                "      \"details\": {\n" +
                "        \"prod_type\": 0,\n" +
                "        \"uri\": \"redmart-strong-and-absorbent-kitchen-towels-21286\",\n" +
                "        \"status\": 1,\n" +
                "        \"is_new\": 0.0,\n" +
                "        \"storage_class\": \"JTBPF\",\n" +
                "        \"country_of_origin\": \"Malaysia\"\n" +
                "      },\n" +
                "      \"filters\": {\n" +
                "        \"fsc\": 1,\n" +
                "        \"vendor_name\": \"SANRIX\",\n" +
                "        \"brand_uri\": \"redmart\",\n" +
                "        \"mfr_name\": \"Sanrix Paper SDN BHD\",\n" +
                "        \"brand_name\": \"RedMart\",\n" +
                "        \"frequency\": 38707,\n" +
                "        \"trending_frequency\": 5892,\n" +
                "        \"country_of_origin\": \"Malaysia\"\n" +
                "      },\n" +
                "      \"img\": {\n" +
                "        \"h\": 0,\n" +
                "        \"w\": 0,\n" +
                "        \"name\": \"/i/m/504445126400_1446443807223.jpg\",\n" +
                "        \"position\": 0\n" +
                "      },\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"h\": 0,\n" +
                "          \"w\": 0,\n" +
                "          \"name\": \"/i/m/504445126400_1446443807223.jpg\",\n" +
                "          \"position\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"h\": 0,\n" +
                "          \"w\": 0,\n" +
                "          \"name\": \"/i/m/5044451262_1446443633607.jpg\",\n" +
                "          \"position\": 1\n" +
                "        }\n" +
                "      ],\n" +
                "      \"measure\": {\n" +
                "        \"wt_or_vol\": \"6 x 60 per pack\",\n" +
                "        \"size\": 0.0\n" +
                "      },\n" +
                "      \"pricing\": {\n" +
                "        \"on_sale\": 0,\n" +
                "        \"price\": 3.8,\n" +
                "        \"promo_price\": 0.0,\n" +
                "        \"savings\": 0.0\n" +
                "      },\n" +
                "      \"warehouse\": {\n" +
                "        \"measure\": {\n" +
                "          \"vol\": 60.0,\n" +
                "          \"vol_metric\": \"pcs\",\n" +
                "          \"wt_metric\": \"\",\n" +
                "          \"l\": 0.0,\n" +
                "          \"w\": 0.0,\n" +
                "          \"h\": 0.0,\n" +
                "          \"wt\": 0.0\n" +
                "        }\n" +
                "      },\n" +
                "      \"attributes\": {\n" +
                "        \"dag\": []\n" +
                "      },\n" +
                "      \"description_fields\": {\n" +
                "        \"secondary\": [\n" +
                "          {\n" +
                "            \"name\": \"Material Composition\",\n" +
                "            \"content\": \"100% Virgin Pulp\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Storage Guidelines\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Cooking & Preparation\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Return Policy\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Certifications & Endorsements\",\n" +
                "            \"content\": \"FSC - COC Certified\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Washing/Cleaning Instructions\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"About the Brand\",\n" +
                "            \"content\": \"\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"primary\": [\n" +
                "          {\n" +
                "            \"name\": \"About the Product\",\n" +
                "            \"content\": \"Strong and Absorbent. Made from Environmental Responsible Sources. FSC - COC Certified.\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Dimensions\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Dietary Information\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"How to Use\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"MAHP/MAHS\",\n" +
                "            \"content\": \"\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Country of Origin\",\n" +
                "            \"content\": \"Malaysia\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"inventory\": {\n" +
                "        \"atp_status\": 0,\n" +
                "        \"max_sale_qty\": 48,\n" +
                "        \"qty_in_carts\": 0,\n" +
                "        \"qty_in_stock\": 48,\n" +
                "        \"stock_status\": 1,\n" +
                "        \"stock_type\": 0,\n" +
                "        \"next_available_date\": \"2018-03-27T16:18:18Z\",\n" +
                "        \"limited_stock_status\": 0,\n" +
                "        \"atp_lots\": [\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T16:18:18Z\",\n" +
                "            \"to_date\": \"4712-12-31T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 2643,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"pr\": 2\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 42638,\n" +
                "      \"title\": \"Givvo Local Tomatoes\",\n" +
                "      \"desc\": \"Product of Malaysia. Tomatoes are widely known for their outstanding antioxidant content, including, of course, their oftentimes-rich concentration of lycopene.\",\n" +
                "      \"sku\": \"8885003326287\",\n" +
                "      \"categories\": [\n" +
                "        243,\n" +
                "        248,\n" +
                "        5700,\n" +
                "        246,\n" +
                "        5813,\n" +
                "        5976,\n" +
                "        3450,\n" +
                "        3455,\n" +
                "        3277,\n" +
                "        5325,\n" +
                "        10490,\n" +
                "        12651\n" +
                "      ],\n" +
                "      \"types\": [\n" +
                "        5548,\n" +
                "        5814,\n" +
                "        5980,\n" +
                "        5978,\n" +
                "        6513,\n" +
                "        5334,\n" +
                "        3475\n" +
                "      ],\n" +
                "      \"details\": {\n" +
                "        \"prod_type\": 0,\n" +
                "        \"uri\": \"givvo-local-tomatoes-42638\",\n" +
                "        \"status\": 1,\n" +
                "        \"is_new\": 0.0,\n" +
                "        \"storage_class\": \"Fresh6-10\",\n" +
                "        \"country_of_origin\": \"Malaysia\"\n" +
                "      },\n" +
                "      \"product_life\": {\n" +
                "        \"time\": 5,\n" +
                "        \"metric\": \"D\",\n" +
                "        \"is_minimum\": true,\n" +
                "        \"time_including_delivery\": 6\n" +
                "      },\n" +
                "      \"filters\": {\n" +
                "        \"mfr_name\": \"Cultured Greens\",\n" +
                "        \"trending_frequency\": 5531,\n" +
                "        \"is_organic\": 0,\n" +
                "        \"country_of_origin\": \"Malaysia\",\n" +
                "        \"vendor_name\": \"CultGrn\",\n" +
                "        \"brand_name\": \"Givvo\",\n" +
                "        \"brand_uri\": \"givvo\",\n" +
                "        \"frequency\": 34460,\n" +
                "        \"festive_bbq\": \"Vegetables & Mushrooms\",\n" +
                "        \"potluck\": \"Vegetables\"\n" +
                "      },\n" +
                "      \"img\": {\n" +
                "        \"h\": 0,\n" +
                "        \"w\": 0,\n" +
                "        \"name\": \"/i/m/8885003326287_0233_1448861757039.jpg\",\n" +
                "        \"position\": 0\n" +
                "      },\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"h\": 0,\n" +
                "          \"w\": 0,\n" +
                "          \"name\": \"/i/m/8885003326287_0233_1448861757039.jpg\",\n" +
                "          \"position\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"h\": 0,\n" +
                "          \"w\": 0,\n" +
                "          \"name\": \"/i/m/8885003326287_0202_1448861752772.jpg\",\n" +
                "          \"position\": 1\n" +
                "        }\n" +
                "      ],\n" +
                "      \"measure\": {\n" +
                "        \"wt_or_vol\": \"500 g\",\n" +
                "        \"size\": 0.0\n" +
                "      },\n" +
                "      \"pricing\": {\n" +
                "        \"on_sale\": 0,\n" +
                "        \"price\": 1.3,\n" +
                "        \"promo_price\": 0.0,\n" +
                "        \"savings_type\": 0\n" +
                "      },\n" +
                "      \"warehouse\": {\n" +
                "        \"measure\": {\n" +
                "          \"vol_metric\": \"\",\n" +
                "          \"wt\": 500.0,\n" +
                "          \"wt_metric\": \"g\",\n" +
                "          \"l\": 0.0,\n" +
                "          \"w\": 0.0,\n" +
                "          \"h\": 0.0\n" +
                "        }\n" +
                "      },\n" +
                "      \"attributes\": {\n" +
                "        \"dag\": []\n" +
                "      },\n" +
                "      \"description_fields\": {\n" +
                "        \"secondary\": [\n" +
                "          {\n" +
                "            \"name\": \"Storage Guidelines\",\n" +
                "            \"content\": \"Recommended to store at chilled temperature:1-3 degrees is highly perishable and should be transferred to cool storage immediately. Reduce stocking and practice good stock rotation to maintain freshness. Prolonged storage is not recommended.\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"primary\": [\n" +
                "          {\n" +
                "            \"name\": \"Delivery & Handling\",\n" +
                "            \"content\": \"Guaranteed Fresh, or get your money back.We take great pride in the quality of our fresh foods, so we guarantee your satisfaction with every product, every time.Our fruit & vegetables are delivered fresh on demand, to RedMart by approved suppliers and only the best of the bunch are hand-picked by our certified pickers, before being delivered directly to your door.  We skip the supermarket so your food arrives fresher without being poked by 50 pairs of curious hands.All of our fresh fruit & vegetables are stored in chilled, temperature controlled environments, which is maintained in our specially-lined totes, so your produce arrives as cool as a cumumber, from our door to yours.We guarantee to deliver the optimum freshness for each item, often far fresher than our competitors.  Start counting the freshness days on the day you get your delivery.  Our produce is best enjoyed within the number of days stated on the product page above.  Please note that this is only the minimum guarantee - with appropriate food storage, you may enjoy longer freshness days.If you are not satisfied with your fresh Fruit & Veg in any way, please fill up the simple form by going to: Help>Self Service Support Centre with the required information, within 2 days of delivery, and we will give you your money back.\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Country of Origin\",\n" +
                "            \"content\": \"Malaysia\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"max_days_on_shelf\": 10,\n" +
                "      \"inventory\": {\n" +
                "        \"atp_status\": 0,\n" +
                "        \"max_sale_qty\": 48,\n" +
                "        \"qty_in_carts\": 0,\n" +
                "        \"qty_in_stock\": 48,\n" +
                "        \"stock_status\": 1,\n" +
                "        \"stock_type\": 0,\n" +
                "        \"next_available_date\": \"2018-03-27T17:34:29Z\",\n" +
                "        \"limited_stock_status\": 0,\n" +
                "        \"atp_lots\": [\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T17:34:29Z\",\n" +
                "            \"to_date\": \"2018-03-31T15:59:59Z\",\n" +
                "            \"stock_status\": 0,\n" +
                "            \"qty_in_stock\": 0,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T17:34:29Z\",\n" +
                "            \"to_date\": \"2018-04-01T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 352,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-29T07:00:00Z\",\n" +
                "            \"to_date\": \"2018-04-02T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 310,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-30T07:00:00Z\",\n" +
                "            \"to_date\": \"2018-04-03T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 297,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-04-05T03:00:00Z\",\n" +
                "            \"to_date\": \"2018-05-03T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 100000,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"pr\": 3\n" +
                "    },\n" +
                "    {\n" +
                "      \"desc\": \"Product of Malaysia. Spicy, juicy, baseball-sized bundles of flavor. These pungent staples release their flavor when sauteed, braised, grilled, or roasted. Dredge with flour and deep-fry for decadent onion rings. These tear-inducing onions are usually considered too strong for eating raw.\",\n" +
                "      \"details\": {\n" +
                "        \"country_of_origin\": \"Malaysia\",\n" +
                "        \"is_new\": 0.0,\n" +
                "        \"prod_type\": 0,\n" +
                "        \"status\": 1,\n" +
                "        \"storage_class\": \"Fresh2-5\",\n" +
                "        \"uri\": \"givvo-large-yellow-onions-31462\"\n" +
                "      },\n" +
                "      \"filters\": {\n" +
                "        \"is_organic\": 0,\n" +
                "        \"brand_uri\": \"givvo\",\n" +
                "        \"mfr_name\": \"Hu Lee Impex\",\n" +
                "        \"frequency\": 30279,\n" +
                "        \"brand_name\": \"Givvo\",\n" +
                "        \"vendor_name\": \"CultGrn\",\n" +
                "        \"country_of_origin\": \"Malaysia\",\n" +
                "        \"trending_frequency\": 4384,\n" +
                "        \"festive_bbq\": \"Vegetables & Mushrooms\",\n" +
                "        \"potluck\": \"Vegetables\"\n" +
                "      },\n" +
                "      \"id\": 31462,\n" +
                "      \"images\": [\n" +
                "        {\n" +
                "          \"h\": 0,\n" +
                "          \"w\": 0,\n" +
                "          \"name\": \"/i/m/Brown_Onions_1437700375019.JPG\",\n" +
                "          \"position\": 0\n" +
                "        }\n" +
                "      ],\n" +
                "      \"img\": {\n" +
                "        \"h\": 0,\n" +
                "        \"w\": 0,\n" +
                "        \"name\": \"/i/m/Brown_Onions_1437700375019.JPG\",\n" +
                "        \"position\": 0\n" +
                "      },\n" +
                "      \"measure\": {\n" +
                "        \"wt_or_vol\": \"500 g\",\n" +
                "        \"size\": 0.0\n" +
                "      },\n" +
                "      \"pricing\": {\n" +
                "        \"on_sale\": 0,\n" +
                "        \"price\": 1.5,\n" +
                "        \"promo_price\": 0.0,\n" +
                "        \"savings_type\": 0\n" +
                "      },\n" +
                "      \"product_life\": {\n" +
                "        \"time\": 7,\n" +
                "        \"metric\": \"D\",\n" +
                "        \"is_minimum\": true,\n" +
                "        \"time_including_delivery\": 8\n" +
                "      },\n" +
                "      \"sku\": \"8885003326768\",\n" +
                "      \"title\": \"Givvo Yellow Onions\",\n" +
                "      \"types\": [\n" +
                "        1748,\n" +
                "        3475,\n" +
                "        5486,\n" +
                "        5814,\n" +
                "        5980,\n" +
                "        5979,\n" +
                "        6513,\n" +
                "        5334\n" +
                "      ],\n" +
                "      \"warehouse\": {\n" +
                "        \"measure\": {\n" +
                "          \"vol_metric\": \"\",\n" +
                "          \"wt\": 500.0,\n" +
                "          \"wt_metric\": \"g\",\n" +
                "          \"l\": 0.0,\n" +
                "          \"w\": 0.0,\n" +
                "          \"h\": 0.0\n" +
                "        }\n" +
                "      },\n" +
                "      \"description_fields\": {\n" +
                "        \"secondary\": [\n" +
                "          {\n" +
                "            \"name\": \"Storage Guidelines\",\n" +
                "            \"content\": \"Recommended to store at chilled temperature:1-3 degrees is highly perishable and should be transferred to cool storage immediately. Reduce stocking and practice good stock rotation to maintain freshness. Prolonged storage is not recommended.\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"primary\": [\n" +
                "          {\n" +
                "            \"name\": \"Delivery & Handling\",\n" +
                "            \"content\": \"Guaranteed Fresh, or get your money back.We take great pride in the quality of our fresh foods, so we guarantee your satisfaction with every product, every time.Our fruit & vegetables are delivered fresh on demand, to RedMart by approved suppliers and only the best of the bunch are hand-picked by our certified pickers, before being delivered directly to your door.  We skip the supermarket so your food arrives fresher without being poked by 50 pairs of curious hands.All of our fresh fruit & vegetables are stored in chilled, temperature controlled environments, which is maintained in our specially-lined totes, so your produce arrives as cool as a cumumber, from our door to yours.We guarantee to deliver the optimum freshness for each item, often far fresher than our competitors.  Start counting the freshness days on the day you get your delivery.  Our produce is best enjoyed within the number of days stated on the product page above.  Please note that this is only the minimum guarantee - with appropriate food storage, you may enjoy longer freshness days.If you are not satisfied with your fresh Fruit & Veg in any way, please fill up the simple form by going to: Help>Self Service Support Centre with the required information, within 2 days of delivery, and we will give you your money back.\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Country of Origin\",\n" +
                "            \"content\": \"Malaysia\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"max_days_on_shelf\": 14,\n" +
                "      \"inventory\": {\n" +
                "        \"max_sale_qty\": 48,\n" +
                "        \"qty_in_carts\": 0,\n" +
                "        \"qty_in_stock\": 48,\n" +
                "        \"stock_status\": 1,\n" +
                "        \"stock_type\": 0,\n" +
                "        \"next_available_date\": \"2018-03-27T16:02:46Z\",\n" +
                "        \"limited_stock_status\": 0,\n" +
                "        \"atp_lots\": [\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T16:02:46Z\",\n" +
                "            \"to_date\": \"2018-04-02T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 56,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-27T16:02:46Z\",\n" +
                "            \"to_date\": \"2018-04-03T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 345,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-29T07:00:00Z\",\n" +
                "            \"to_date\": \"2018-04-04T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 62,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-03-30T07:00:00Z\",\n" +
                "            \"to_date\": \"2018-04-05T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 292,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          },\n" +
                "          {\n" +
                "            \"from_date\": \"2018-04-05T03:00:00Z\",\n" +
                "            \"to_date\": \"2018-05-03T15:59:59Z\",\n" +
                "            \"stock_status\": 1,\n" +
                "            \"qty_in_stock\": 100000,\n" +
                "            \"qty_in_carts\": 0\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"pr\": 4\n" +
                "    }\n" +
                "  ],\n" +
                "  \"on_sale_count\": 39745,\n" +
                "  \"status\": {\n" +
                "    \"msg\": \"Listing products\",\n" +
                "    \"code\": 0\n" +
                "  },\n" +
                "  \"total\": 120233,\n" +
                "  \"page\": 0,\n" +
                "  \"page_size\": 20\n" +
                "}";
    }

    private String getProductJsonData() {
        return "{\n" +
                "  \"total\": 1,\n" +
                "  \"product\": {\n" +
                "    \"category_tags\": [\n" +
                "      \"fresh-produce\",\n" +
                "      \"fresh-vegetables\",\n" +
                "      \"salad-vegetables-246\",\n" +
                "      \"avocados-5571\",\n" +
                "      \"fresh-fruits\",\n" +
                "      \"avocados\",\n" +
                "      \"salads\",\n" +
                "      \"salad-vegetables-5813\",\n" +
                "      \"avocados-5814\",\n" +
                "      \"cooking-styles\",\n" +
                "      \"indian-5976\",\n" +
                "      \"western\",\n" +
                "      \"christmas\",\n" +
                "      \"magical-meals\",\n" +
                "      \"easy-platters-appetisers\",\n" +
                "      \"canapes-dips-5334\",\n" +
                "      \"edible-goals-for-the-new-year-0\",\n" +
                "      \"comfort-food\",\n" +
                "      \"direct-retail\",\n" +
                "      \"freshbdit\",\n" +
                "      \"energy-superheroes\",\n" +
                "      \"featured-buyers-choice\",\n" +
                "      \"goodcarbs\"\n" +
                "    ],\n" +
                "    \"id\": 82182,\n" +
                "    \"title\": \"Mexican Airflown Avocados\",\n" +
                "    \"desc\": \"Avocado is a lush fruit with bright green flesh from the tropics.Varieties range from round to pear-shaped with skin ranging incolour from black to green and smooth to dimpler.\",\n" +
                "    \"sku\": \"8886458105298\",\n" +
                "    \"categories\": [\n" +
                "      243,\n" +
                "      246,\n" +
                "      5719,\n" +
                "      5813,\n" +
                "      5976,\n" +
                "      3277,\n" +
                "      5325,\n" +
                "      11045,\n" +
                "      11594,\n" +
                "      10490,\n" +
                "      12561,\n" +
                "      12612,\n" +
                "      9023,\n" +
                "      12654\n" +
                "    ],\n" +
                "    \"types\": [\n" +
                "      5814,\n" +
                "      5734,\n" +
                "      5979,\n" +
                "      5980,\n" +
                "      5334\n" +
                "    ],\n" +
                "    \"details\": {\n" +
                "      \"prod_type\": 0,\n" +
                "      \"uri\": \"mexican-airflown-avocados-82182\",\n" +
                "      \"status\": 1,\n" +
                "      \"is_new\": 0.0,\n" +
                "      \"storage_class\": \"Fresh6-10\",\n" +
                "      \"country_of_origin\": \"Mexico\"\n" +
                "    },\n" +
                "    \"product_life\": {\n" +
                "      \"time\": 3,\n" +
                "      \"metric\": \"D\",\n" +
                "      \"is_minimum\": true,\n" +
                "      \"time_including_delivery\": 4\n" +
                "    },\n" +
                "    \"filters\": {\n" +
                "      \"mfr_name\": \"Mexican\",\n" +
                "      \"trending_frequency\": 2695,\n" +
                "      \"is_organic\": 0,\n" +
                "      \"country_of_origin\": \"Mexico\",\n" +
                "      \"vendor_name\": \"BanChoon\",\n" +
                "      \"brand_name\": \"Mexican\",\n" +
                "      \"brand_uri\": \"mexican\",\n" +
                "      \"frequency\": 17288,\n" +
                "      \"festive_bbq\": \"Vegetables & Mushrooms\",\n" +
                "      \"potluck\": \"Vegetables\"\n" +
                "    },\n" +
                "    \"img\": {\n" +
                "      \"h\": 0,\n" +
                "      \"w\": 0,\n" +
                "      \"name\": \"/i/m/88864581052980021_1477382140953.jpg\",\n" +
                "      \"position\": 0\n" +
                "    },\n" +
                "    \"images\": [\n" +
                "      {\n" +
                "        \"h\": 0,\n" +
                "        \"w\": 0,\n" +
                "        \"name\": \"/i/m/88864581052980021_1477382140953.jpg\",\n" +
                "        \"position\": 0\n" +
                "      },\n" +
                "      {\n" +
                "        \"h\": 0,\n" +
                "        \"w\": 0,\n" +
                "        \"name\": \"/i/m/88864581052980003_1477382142737.jpg\",\n" +
                "        \"position\": 1\n" +
                "      }\n" +
                "    ],\n" +
                "    \"measure\": {\n" +
                "      \"wt_or_vol\": \"3 per pack\",\n" +
                "      \"size\": 0.0\n" +
                "    },\n" +
                "    \"pricing\": {\n" +
                "      \"on_sale\": 0,\n" +
                "      \"price\": 6.15,\n" +
                "      \"promo_price\": 0,\n" +
                "      \"savings\": 0.0\n" +
                "    },\n" +
                "    \"warehouse\": {\n" +
                "      \"measure\": {\n" +
                "        \"vol\": 3.0,\n" +
                "        \"vol_metric\": \"pcs\",\n" +
                "        \"wt_metric\": \"\",\n" +
                "        \"l\": 0.0,\n" +
                "        \"w\": 0.0,\n" +
                "        \"h\": 0.0,\n" +
                "        \"wt\": 0.0\n" +
                "      }\n" +
                "    },\n" +
                "    \"attributes\": {\n" +
                "      \"dag\": []\n" +
                "    },\n" +
                "    \"description_fields\": {\n" +
                "      \"secondary\": [],\n" +
                "      \"primary\": [\n" +
                "        {\n" +
                "          \"name\": \"About the Product\",\n" +
                "          \"content\": \"Avocado is a lush fruit with bright green flesh from the tropics.Varieties range from round to pear-shaped with skin ranging incolour from black to green and smooth to dimpler.\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"Delivery & Handling\",\n" +
                "          \"content\": \"Guaranteed Fresh, or get your money back.We take great pride in the quality of our fresh foods, so we guarantee your satisfaction with every product, every time.Our fruit & vegetables are delivered fresh on demand, to RedMart by approved suppliers and only the best of the bunch are hand-picked by our certified pickers, before being delivered directly to your door.  We skip the supermarket so your food arrives fresher without being poked by 50 pairs of curious hands.All of our fresh fruit & vegetables are stored in chilled, temperature controlled environments, which is maintained in our specially-lined totes, so your produce arrives as cool as a cumumber, from our door to yours.We guarantee to deliver the optimum freshness for each item, often far fresher than our competitors.  Start counting the freshness days on the day you get your delivery.  Our produce is best enjoyed within the number of days stated on the product page above.  Please note that this is only the minimum guarantee - with appropriate food storage, you may enjoy longer freshness days.If you are not satisfied with your fresh Fruit & Veg in any way, please fill up the simple form by going to: Help>Self Service Support Centre with the required information, within 2 days of delivery, and we will give you your money back.\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"Country of Origin\",\n" +
                "          \"content\": \"Mexico\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    \"max_days_on_shelf\": 8,\n" +
                "    \"promotions\": [],\n" +
                "    \"inventory\": {\n" +
                "      \"atp_status\": 0,\n" +
                "      \"max_sale_qty\": 48,\n" +
                "      \"qty_in_carts\": 0,\n" +
                "      \"qty_in_stock\": 48,\n" +
                "      \"stock_status\": 1,\n" +
                "      \"stock_type\": 0,\n" +
                "      \"atp_lots\": [\n" +
                "        {\n" +
                "          \"from_date\": \"2018-03-29T12:34:43Z\",\n" +
                "          \"to_date\": \"2018-03-31T15:59:59Z\",\n" +
                "          \"stock_status\": 0,\n" +
                "          \"qty_in_stock\": 0,\n" +
                "          \"qty_in_carts\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"from_date\": \"2018-03-29T12:34:43Z\",\n" +
                "          \"to_date\": \"2018-04-01T15:59:59Z\",\n" +
                "          \"stock_status\": 1,\n" +
                "          \"qty_in_stock\": 419,\n" +
                "          \"qty_in_carts\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"from_date\": \"2018-03-29T12:34:43Z\",\n" +
                "          \"to_date\": \"2018-04-03T15:59:59Z\",\n" +
                "          \"stock_status\": 1,\n" +
                "          \"qty_in_stock\": 132,\n" +
                "          \"qty_in_carts\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"from_date\": \"2018-04-01T09:00:00Z\",\n" +
                "          \"to_date\": \"2018-04-05T15:59:59Z\",\n" +
                "          \"stock_status\": 1,\n" +
                "          \"qty_in_stock\": 405,\n" +
                "          \"qty_in_carts\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"from_date\": \"2018-04-03T09:00:00Z\",\n" +
                "          \"to_date\": \"2018-04-07T15:59:59Z\",\n" +
                "          \"stock_status\": 1,\n" +
                "          \"qty_in_stock\": 428,\n" +
                "          \"qty_in_carts\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"from_date\": \"2018-04-04T09:00:00Z\",\n" +
                "          \"to_date\": \"2018-04-08T15:59:59Z\",\n" +
                "          \"stock_status\": 1,\n" +
                "          \"qty_in_stock\": 420,\n" +
                "          \"qty_in_carts\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"from_date\": \"2018-04-07T05:00:00Z\",\n" +
                "          \"to_date\": \"2018-05-05T15:59:59Z\",\n" +
                "          \"stock_status\": 1,\n" +
                "          \"qty_in_stock\": 100000,\n" +
                "          \"qty_in_carts\": 0\n" +
                "        }\n" +
                "      ],\n" +
                "      \"next_available_date\": \"2018-03-29T12:34:43Z\",\n" +
                "      \"limited_stock_status\": 0,\n" +
                "      \"available_slots\": [\n" +
                "        {\n" +
                "          \"date\": \"2018-03-29T15:56:13Z\",\n" +
                "          \"available\": \"PARTIAL\",\n" +
                "          \"slots\": [\n" +
                "            {\n" +
                "              \"from\": \"2018-03-29T12:34:43Z\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"date\": \"2018-03-30T15:56:13Z\",\n" +
                "          \"available\": \"ALL_DAY\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"date\": \"2018-03-31T15:56:13Z\",\n" +
                "          \"available\": \"ALL_DAY\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"date\": \"2018-04-01T15:56:13Z\",\n" +
                "          \"available\": \"PARTIAL\",\n" +
                "          \"slots\": [\n" +
                "            {\n" +
                "              \"from\": \"2018-04-01T09:00:00Z\"\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"date\": \"2018-04-02T15:56:13Z\",\n" +
                "          \"available\": \"ALL_DAY\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"date\": \"2018-04-03T15:56:13Z\",\n" +
                "          \"available\": \"PARTIAL\",\n" +
                "          \"slots\": [\n" +
                "            {\n" +
                "              \"from\": \"2018-04-03T09:00:00Z\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  },\n" +
                "  \"page\": 0,\n" +
                "  \"status\": {\n" +
                "    \"msg\": \"\",\n" +
                "    \"code\": 2000\n" +
                "  },\n" +
                "  \"page_size\": 1\n" +
                "}";
    }
}
