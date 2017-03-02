package com.rukiasoft.androidapps.cocinaconroll.utilities;


public class RecetasCookeoConstants {
    public static final String SENDER_ID = "962580870211";
    public static final String PACKAGE_NAME = "com.rukiasoft.androidapps.cocinaconroll";

    public static final String PREFERENCE_INTERSTITIAL = PACKAGE_NAME + ".interstitial";
    public static final String RECIPES_DIR = "recipes";
    public static final String BASE_DIR = "CookingWihCookeo";
    public static final String OLD_BASE_DIR = "CocinandoconmiCookeo";
    public static final String ZIPS_DIR = "zips";

    public static final Integer FLAG_ASSETS = 1;
    public static final Integer FLAG_ORIGINAL = 2;
    public static final Integer FLAG_EDITED = 4;
    public static final Integer FLAG_EDITED_PICTURE = 8;
    public static final Integer FLAG_OWN = 16;

    public static final String SEARCH_FIELD = "search_field";
    public static final String SEARCH_ICON_TYPE = "search_icon_type";
    public static final String SEARCH_NAME_TYPE = "search_name_type";
    public static final String SEARCH_ALL = "search_all";
    public static final String SEARCH_STARTERS = "search_starters";
    public static final String SEARCH_MAIN = "search_main";
    public static final String SEARCH_DESSERTS = "search_desserts";
    public static final String SEARCH_VEGETARIAN = "search_vegetarians";
    public static final String SEARCH_FAVOURITES = "search_favourites";
    public static final String SEARCH_OWN = "search_own";
    public static final String SEARCH_LATEST = "search_latest";

    public static final String TYPE_STARTERS = "starter";
    public static final String TYPE_MAIN = "main";
    public static final String TYPE_DESSERTS = "dessert";

    public static final String KEY_RECIPE = RecetasCookeoConstants.PACKAGE_NAME + ".recipe";
    public static final String KEY_DELETE_OLD_PICTURE = RecetasCookeoConstants.PACKAGE_NAME +  ".deleteoldpicture";
    public static final String KEY_TYPE = RecetasCookeoConstants.PACKAGE_NAME + ".type";
    public static final String KEY_SIGN_OUT = RecetasCookeoConstants.PACKAGE_NAME + ".sign_out";
    public static final int REQUEST_DETAILS = 200;
    public static final int REQUEST_CREATE_RECIPE = 201;
    public static final int REQUEST_EDIT_RECIPE = 202;
    public static final int RESULT_UPDATE_RECIPE = 300;
    public static final int RESULT_DELETE_RECIPE = 301;

    public static final String PROPERTY_DATABASE_CREATED = "database_created";
    public static final String PROPERTY_INIT_DATABASE_WITH_EDITED_PATH = "initdatabaseedited";
    public static final String PROPERTY_RELOAD_NEW_ORIGINALS = "reloadneworiginals";
    public static final String PROPERTY_DAYS_TO_NEXT_UPDATE = "last_updated";
    public static final String PROPERTY_EXPIRATION_TIME = "time_to_check_new_zips_again";
    public static final String PROPERTY_AVOID_GOOGLE_SIGN_IN = "avoid_google_sign_in";
    public static final String PROPERTY_HIDE_SWIPE_DIALOG = "hide_swipe_dialog";
    public static final String PROPERTY_DEVICE_OWNER_EMAIL = "device_owner_email";
    public static final String PROPERTY_DEVICE_OWNER_NAME = "device_owner_name";
    public static final String PROPERTY_FIREBASE_ID = "firebase_id";
    public static final String PROPERTY_UPLOADED_RECIPES_ON_FIRST_BOOT = "uploaded_recipes_on_first_boot";
    public static final String PROPERTY_APP_VERSION_STORED = "app_version_stored";
    public static final String PROPERTY_CAN_UPLOAD_OWN_RECIPES = "own_old_recipes";
    public static final String PROPERTY_SIGNED_IN = "signed_in";

    public static final String FORMAT_DATE_TIME = "yyyy-MM-dd_HH-mm-ss";
    public static final String DEFAULT_PICTURE_NAME = "default_picture";
    public static final String ASSETS_PATH = "file:///android_asset/";
    public static final String FILE_PATH = "file://";


    public static final String TEMP_CAMERA_NAME = "tmp_avatar_";
    public static final String START_DOWNLOAD_ACTION_INTENT = PACKAGE_NAME + ".action.START_DOWNLOAD";
    public static final String ACTION_UPLOAD_RECIPE = PACKAGE_NAME + ".action.UPLOAD_RECIPE";
    public static final String ACTION_DELETE_RECIPE = PACKAGE_NAME + ".action.DELETE_RECIPE";
    public static final String ACTION_BROADCAST_UPLOADED_RECIPE = PACKAGE_NAME + ".action.ACTION_BROADCAST_UPLOADED_RECIPE";
    public static final String ACTION_BROADCAST_DELETED_RECIPE = PACKAGE_NAME + ".action.ACTION_BROADCAST_DELETED_RECIPE";
    public static final String ACTION_GET_RECIPES_FROM_DRIVE = PACKAGE_NAME + ".action.GET_RECIPES_IN_DRIVE";
    public static final String ACTION_BROADCAST_GET_RECIPES_FROM_DRIVE = PACKAGE_NAME + ".action.ACTION_BROADCAST_GET_RECIPES_FROM_DRIVE";

    public static final String MIME_TYPE_RECIPE = "application/xml";
    public static final String MIME_TYPE_PICTURE = "image/jpeg";
    public static final String MIME_TYPE_ZIP = "application/zip";

    public static final Integer STATE_NOT_DOWNLOADED = 0;
    public static final Integer STATE_DOWNLOADED_NOT_UNZIPED = 1;
    public static final Integer STATE_DOWNLOADED_UNZIPED_NOT_ERASED = 2;
    public static final Integer STATE_DOWNLOADED_UNZIPED_ERASED = 3;


    public static final String ALLOWED_RECIPES_NODE = "allowed_recipes";
    public static final String FORBIDDEN_RECIPES_NODE = "forbidden_recipes";
    public static final String PENDING_RECIPES_NODE = "pending_recipes";
    public static final String RECIPE_LIST_NODE = "recipe_list";
    public static final String PERSONAL_RECIPES_NODE = "personal_recipes";

    public static final String DETAILED_RECIPES_NODE = "detailed_recipes";
    public static final String TIMESTAMP_RECIPES_NODE = "timestamp";
    public static final String SHORT_RECIPES_NODE = "short_recipes";

    public static final Integer PATH_TYPE_ASSETS = 0;
    public static final Integer PATH_TYPE_ORIGINAL = 1;
    public static final Integer PATH_TYPE_EDITED = 2;
    public static final Integer PATH_TYPE_OLD_EDITED = 3;

    public static final Long TIMEFRAME_MILI_SECONDS_DAY = (long) (1000 * 3600 * 24);
    public static final Integer TIMEFRAME_NEW_RECIPE_DAYS = 7;

    public static final String FILTER_ALL_RECIPES = PACKAGE_NAME + ".allrecipes";
    public static final String FILTER_STARTER_RECIPES = PACKAGE_NAME + ".starters";
    public static final String FILTER_MAIN_COURSES_RECIPES = PACKAGE_NAME + ".maincourses";
    public static final String FILTER_DESSERT_RECIPES = PACKAGE_NAME + ".desserts";
    public static final String FILTER_VEGETARIAN_RECIPES = PACKAGE_NAME + ".vegetarians";
    public static final String FILTER_FAVOURITE_RECIPES = PACKAGE_NAME + ".favourites";
    public static final String FILTER_OWN_RECIPES = PACKAGE_NAME + ".ownrecipes";
    public static final String FILTER_LATEST_RECIPES = PACKAGE_NAME + ".latest";

    public static final int LOADER_ID = 1;
    public static final int N_RECIPES_TO_INTERSTICIAL = 5;


    public static final String EMAIL = "rukiasoft@gmail.com";


    public static final int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE = 11;
    public static final int MY_PERMISSIONS_REQUEST_CAMERA = 12;
    public static final int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 13;


    public static final String RECIPES_TABLE_NAME = "RECIPES";
    public static final String FIELD_NAME_NORMALIZED = "NORMALIZED_NAME";

    public static final String STORAGE_URL = "gs://hardy-binder-89508.appspot.com";
    public static final String STORAGE_NODE = "recipes";
    public static final String RUKIA_TAG = "RUKIA";

    public static int LANG_SPANISH = 0;

    //Request codes
    public static final int REQUEST_CODE_ANIMATION = 101;
    public static final int REQUEST_CODE_SETTINGS = 102;
    public static final int REQUEST_CODE_SIGNING_FROM_SPLASH = 103;
    public static final int REQUEST_CODE_SIGNING_FROM_RECIPELIST = 104;
    public static final int REQUEST_CODE_GOOGLE_SIGN_IN = 104;

    public static final int FLAG_ALLOWED_RECIPE = 1;
    public static final int FLAG_FORBIDDEN_RECIPE = 2;
    public static final int FLAG_PERSONAL_RECIPE = 4;



}
