//package com.example.feigh;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@FeignClient(name = "course", url = "https://openexchangerates.org/api/")
//public interface CourseClient {
//
////    @GetMapping(value = "/latest.json}", consumes = MediaType. APPLICATION_JSON_VALUE)
////    CourseObject getCourse();
//
//
//    /**
//     * demo4 - курс на сегодня
//     *
//     * @param app_id
//     * @return
//     */
//    @GetMapping(value = "/latest.json?app_id={app_id}", consumes = MediaType. APPLICATION_JSON_VALUE)
//    String getCourseAll(@RequestParam String app_id);
//
//    /**
//     * demo4 - Курс на вчера
//     *
//     * @param date_yesterday, app_id
//     * @return
//     */
//    @GetMapping(value = "/historical/{date_yesterday}.json?app_id={app_id}", consumes = MediaType. APPLICATION_JSON_VALUE)
//    String getCourseBase(@RequestParam String date_yesterday, @RequestParam String app_id);
//
//
//
//
//
//
//
////    /**
////     * demo4 - @QueryMap использует pojo
////     *
////     * @param app_id, base, callback
////     * @return
////     */
////    @GetMapping(value = "/latest.json?app_id={app_id}&base={base}&callback={callback}", consumes = MediaType. APPLICATION_JSON_VALUE)
////    CourseObject getCourse(@RequestParam String app_id, @RequestParam String base, @RequestParam String callback);
//
//
//
//
//
//
//
// //   CourseObject getCourse();
//
////    /**
////     * demo1 - базовое использование
////     *
////     * @return
////     */
////    @RequestLine("GET /latest.json")
////    CourseObject getCourse2();
//
//}
//
//
////url = "${validations.host}"