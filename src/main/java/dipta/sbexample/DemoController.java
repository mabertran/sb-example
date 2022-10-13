package dipta.sbexample;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/demo")
class DemoController {
    @GetMapping
    public String get (@RequestParam(defaultValue = "whoever") String name) {
        return String.format("Hello %s", name);
    }
}
