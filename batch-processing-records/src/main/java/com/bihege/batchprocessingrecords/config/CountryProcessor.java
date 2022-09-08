package com.bihege.batchprocessingrecords.config;

import com.bihege.batchprocessingrecords.entity.Country;
import org.springframework.batch.item.ItemProcessor;

public class CountryProcessor implements ItemProcessor<Country, Country> {
    @Override
    public Country process(Country country) throws Exception {
        /* Can filter information
        if (country.getEntity().equals("Afghanistan")) {
            return country;
        } else {
            return null;
        }
        */
         return country;
    }
}
