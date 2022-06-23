package com.example.feigh.test;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

public interface TestInterface {

    public static String ASSET = ".gif";

    /**
     * Курс на сегодня
     *
     * @param app_id
     * @return
     */
    @RequestLine("GET /latest.json?app_id={app_id}")
 //   @Headers("Content-Type: application/json")
    String getCourseNow(@Param("app_id") String app_id);



    /**
     * Курс на вчера
     *
     * @param date_yesterday, app_id
     * @return
     */
    @RequestLine("GET /historical/{date_yesterday}.json?app_id={app_id}")
 //   @Headers("Content-Type: application/json")
    String getCourseYesterday(@Param("date_yesterday") String date_yesterday, @Param("app_id") String app_id);


    /**
     * Повышение курса 1 param
     *
     */
    @RequestLine("GET ?api_key={api_key}")
 //   @Headers("Accept: image/png")
    String getGifRich(@Param("api_key") String api_key);




    /**
     * Повышение курса 3 param bundle
     *
     */
    @RequestLine("GET ?api_key={api_key}&limit={limit}&offset={offset}&bundle={bundle}")
//    @Headers("Accept: .gif")
//    @Headers("Accept: .image/*")

    String getGifRich3(@Param("api_key") String api_key, @Param("limit") int limit, @Param("offset") int offset, @Param("bundle") String bundle);




   // https://giphy.com/search/rich?api_key=VKcwC5rNwIqSznKEkm9FdoNHh0LrWq6P&limit=1&offset=22
}
