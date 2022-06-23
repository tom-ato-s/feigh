package com.example.feigh.test;

import feign.Feign;
import java.net.URISyntaxException;

public class Test {


    private static String app_id = "03a6c20a691540d4afea051b31578752";
    private static String date_yesterday = "2022-06-20";
    private static String someCallbackFunction = "someCallbackFunction";
    private static String URL_CURS = "https://openexchangerates.org/api/";


//    private static String URL_GIF = "https://giphy.com/search/";
    private static String URL_GIF = "https://api.giphy.com/v1/stickers/search/";

    private static String API_KEY = "VKcwC5rNwIqSznKEkm9FdoNHh0LrWq6P";
    private static int LIMIT  = 2;
    private static int OFFSET = 2;

    private static String BUNDLE = "messaging_non_clips";

    public static void main(String[] args) throws URISyntaxException {

//       //Подключение к API курса валют
//        TestInterface testInterface = Feign.builder()
//                .target(TestInterface.class, URL_CURS);
//
//        //Запрос курса на сегодня
//        System.out.println(testInterface.getCourseNow(app_id));

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

//        //Запрос курса на вчера
//        System.out.println(testInterface.getCourseYesterday(date_yesterday, app_id));

 //       Подключение к API gif
        TestInterface testInterface2 = Feign.builder()
                .target(TestInterface.class, URL_GIF);

        System.out.println(testInterface2.getGifRich(API_KEY));

        System.out.println(testInterface2.getGifRich3(API_KEY, LIMIT, OFFSET, BUNDLE));














//        CourseClient courseClient = Feign.builder()
//                .target(CourseClient.class, "https://openexchangerates.org/api/");
//
//      //  System.out.println(courseClient.getCourse());
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
   }
}
