package com.miaoshaproject;

import static org.junit.Assert.assertTrue;

import com.miaoshaproject.dao.PromoDOMapper;
import com.miaoshaproject.dataobject.PromoDO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Autowired
    private PromoDOMapper promoDOMapper;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testSelectByItemId() {
        PromoDO promoDO = promoDOMapper.selectByItemId(1);
        System.out.println(promoDO.getPromoName());
    }
}
