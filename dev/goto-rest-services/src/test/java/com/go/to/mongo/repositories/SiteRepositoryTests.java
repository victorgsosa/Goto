package com.go.to.mongo.repositories;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import com.go.to.mongo.repositories.MongoConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.go.to.model.Site;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoConfig.class)
public class SiteRepositoryTests {

    @Autowired SiteRepository repository;

    @Test
    public void readsFirstPageCorrectly() {
      Page<Site> sites = repository.findAll(new PageRequest(0, 10));
      assertThat(sites.isFirst(), is(true));
    }
}