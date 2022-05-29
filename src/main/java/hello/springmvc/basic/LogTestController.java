package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // System.out.println 은 모두 다 출력이 되기 때문에 로그가 폭탄처럼 출력 될 수 있다.
        // 로그 레벨이 ~ 이상이면 로그를 출력한다.
        log.trace("trace log={}", name); // 다보기 레벨 (최소) : trace 로그만 출력 (로컬 PC)
        log.debug("debug log={}", name); // 디버깅 레벨 (중간) : trace 로그와 debug 로그만 출력 (개발서버)
        log.info(" info log={}", name); // 정보 레벨 (중간) : trace 로그와 debug 로그와 info 로그만 출력 (운영서버)
        log.warn(" warn log={}", name); // 경고 레벨 (중간) : trace 로그와 debug 로그와 info 로그와 warn 로그만 출력
        log.error("error log={}", name); // 에러 레벨 (최고) : trace 로그와 debug 로그와 info 로그와 warn 로그와 error 로그만 출력
        // log.trace("trace log={}"+ name); // 이런 식으로 사용 하면 안된다. 실행 여부와 상관없이 "trace log={}"+ name 를 합치는 연산을 수행해 리로스의 로스가 발생한다.

        return "ok";
    }


}
