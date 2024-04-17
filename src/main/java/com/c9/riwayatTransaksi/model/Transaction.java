package com.c9.riwayatTransaksi.model;
import lombok.Setter;
import lombok.Getter;
import java.util.ArrayList;
@Getter @Setter
public class Transaction {
    private String transactionId;
    private String transactionDate;
    private String userId;
    private String sellerId;
    private String gameId;
    private int total;
}
