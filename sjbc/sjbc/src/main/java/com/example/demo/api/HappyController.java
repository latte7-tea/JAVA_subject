package com.example.demo.api;
import com.example.demo.model.MxxModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/happy")
public class HappyController {
    private static final Logger log =LoggerFactory.getLogger(HappyController.class);
    @Autowired
    MxxModel model;

    @Autowired
    Task task;

    @GetMapping(value="/mxx")
    public MxxModel mxx(){
        return model;
    }
    @GetMapping(value="/myy")
    public String myy(){
        return task.name;
    }
    @PostMapping(value="/mxx")
    public MxxModel setMxx(@RequestBody MxxModel mxx){
        model.setValue(mxx.getValue());
        log.info("set value :{}",model.getValue());
        return mxx;
    }
}
