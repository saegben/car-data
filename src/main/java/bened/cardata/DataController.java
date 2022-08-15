package bened.cardata;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DataController {
    private static Map<Integer, Data> dataRepo = new HashMap<>();
    static {
        Data toyota = new Data();
        toyota.setId(1);
        toyota.setMake("Toyota");
        toyota.setModel("Prius");
        toyota.setYear(2016);
        dataRepo.put(toyota.getId(), toyota);

        Data audi = new Data();
        audi.setId(2);
        audi.setMake("Audi");
        audi.setModel("A4");
        audi.setYear(2005);
        dataRepo.put(audi.getId(), audi);

        Data volvo = new Data();
        volvo.setId(3);
        volvo.setMake("Volvo");
        volvo.setModel("XC90");
        volvo.setYear(2002);
        dataRepo.put(volvo.getId(), volvo);
    }

    @RequestMapping(value = "/data")
    public ResponseEntity<Object> getData() { return new ResponseEntity<>(dataRepo.values(), HttpStatus.OK); }
}
