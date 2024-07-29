package com.example.demo.config;
import com.example.demo.model.MxxModel;
import com.example.demo.model.Task;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SjbcConfiguration {
    @Value("${com.example.prop:Mxx}")
    String Mxx;
    @Bean
    public MxxModel MxxModel(){
        MxxModel model=new MxxModel();
        model.setValue(Mxx);
        return model;
    }
    @Bean
    public Task Task(){
        Task t=new Task();
        t.name="タスク1";
        return t;
    }
}
