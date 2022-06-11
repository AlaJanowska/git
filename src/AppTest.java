public class AppTest {

    public static void main(String[] args) {
        App appTest = new App("Facebook");
        appTest.appInfo();

        AndroidApp android = new AndroidApp("Insta");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphone = new IphoneApp("Onet");
        iphone.appInfo();
        iphone.runIphoneApp();
    }


}
