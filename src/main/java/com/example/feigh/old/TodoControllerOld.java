//package com.example.feigh;
//
//import com.example.feigh.entity.CourseObject;
//import feign.Param;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/latest.json")
//public class TodoController {
//
//    String app_id = "03a6c20a691540d4afea051b31578752";
//    String GBP = "GBP";
//    String someCallbackFunction = "someCallbackFunction";
//
//    @Autowired
//    CourseClient courseClient;
//
////    @GetMapping("/latest.json")
////    public CourseObject getCourse(){
////        return courseClient.getCourse();
////    }
//
//
//
//    /**
//     * demo4 - Курс на сегодня
//     *
//     * @param app_id
//     * @return
//     */
//
//    @GetMapping("/latest.json?app_id={app_id}")
//    public String getCourse(@Param("app_id") String app_id){
//        return courseClient.getCourseAll(app_id);
//    }
//
//        /**
//     * demo4 - Курс на вчера
//     *
//     * @param date_yesterday, app_id
//     * @return
//     */
//
//    @GetMapping("/historical/{date_yesterday}.json?app_id={app_id}")
//    public String getCourse(@Param("date_yesterday") String date_yesterday, @Param("app_id") String app_id){
//        return courseClient.getCourseBase(date_yesterday, app_id);
//    }
//
//
//
////    /**
////     * demo4 - @QueryMap использует pojo
////     *
////     * @param app_id, base, callback
////     * @return
////     */
////
////    @GetMapping("/latest.json?app_id={app_id}&base={base}&callback={callback}")
////    public CourseObject getCourse(@Param("app_id") String app_id, @Param("base") String base, @Param("callback") String callback){
////        return courseClient.getCourse(YOUR_APP_ID,
////               GBP, someCallbackFunction);
////    }
//}
