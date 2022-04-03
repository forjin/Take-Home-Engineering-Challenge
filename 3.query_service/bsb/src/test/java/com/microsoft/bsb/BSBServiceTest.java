package com.microsoft.bsb;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;

import com.microsoft.bsb.controller.BSBController;
import com.microsoft.bsb.model.BSB;
import com.microsoft.bsb.service.BSBService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(BSBController.class)
public class BSBServiceTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private BSBService bsbService;

    @Test
    public void giveShowAll_display()
            throws Exception {

        BSB anz = new BSB();
        anz.setBsb("001-001");
        BSB nab = new BSB();
        nab.setBsb("002-002");
        List<BSB> allBSBs = new ArrayList<>();
        allBSBs.add(anz);
        allBSBs.add(nab);

        when(bsbService.getAll()).thenReturn(allBSBs);

        mvc.perform(get("/service/bsb")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].bsb", is(anz.getBsb())))
                .andExpect(jsonPath("$[1].bsb", is(nab.getBsb())));

    }

    @Test
    public void giveS_specificQuery()
            throws Exception {

        BSB nab = new BSB();
        nab.setBsb("002-002");
        nab.setBsb_address("700 Burke st Docklands");

        when(bsbService.getBSBById(nab.getBsb())).thenReturn(Optional.of(nab));

        mvc.perform(get("/service/bsb/" + nab.getBsb())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.bsb", is(nab.getBsb())))
                .andExpect(jsonPath("$.bsb_address", is(nab.getBsb_address())));

    }
}
