package com.xky.learnandrod.domains;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/5/18.
 */
public class DesignItem {
    private String designName;
    private Client client;


    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
