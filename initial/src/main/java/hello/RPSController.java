package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RPSController {

    @RequestMapping("/rock-paper-scissors")
    public RPS rps(@RequestParam(value="play", defaultValue="rock") String play) {
        return new RPS(name);
    }
}