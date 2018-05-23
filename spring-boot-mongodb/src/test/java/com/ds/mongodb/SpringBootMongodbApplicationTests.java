package com.ds.mongodb;

import com.ds.mongodb.model.StaticParameter;
import com.ds.mongodb.repository.StaticParameterRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMongodbApplicationTests {

    @Autowired
    private StaticParameterRepository staticParameterRepository;

    @Before
    public void setUp() {
        staticParameterRepository.deleteAll();
    }

    @Test
    public void mongodbTest() {
        StaticParameter staticParameter = new StaticParameter();
        staticParameter.setId(1L);
        staticParameter.setProductNo("GS001");
        staticParameterRepository.save(staticParameter);
        Assert.assertEquals(1, staticParameterRepository.count());
        Assert.assertEquals("GS001", staticParameterRepository.findByProductNo("GS001").getProductNo());
    }

}
