package com.example.irfan.exerproject.Network;

public class AppConfig {
    public static String IPC = "https://zamhtechs.com/exerClient/";
    public static String URL_DEALS_FOR_SHOP;
    public static String URL_HOTDEALS;
    public static String URL_LOGIN;
    public static String URL_NEARDEALS;
    public static String URL_NEWSHOPS;
    public static String URL_PREMIUMDEALS;
    public static String URL_REGISTER;
    public static String URL_RESET_PASSWORD;
    public static String URL_SHOPS_FOR_CAT;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("register.php");
        URL_REGISTER = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("login.php");
        URL_LOGIN = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("showHotBrands.php");
        URL_HOTDEALS = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("showNewShops.php");
        URL_NEWSHOPS = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("showPremiumDeals.php");
        URL_PREMIUMDEALS = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("showNearDeals.php");
        URL_NEARDEALS = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("showShopsForCat.php");
        URL_SHOPS_FOR_CAT = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("showDealsForShop.php");
        URL_DEALS_FOR_SHOP = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(IPC);
        stringBuilder.append("resetPassword.php");
        URL_RESET_PASSWORD = stringBuilder.toString();
    }
}
