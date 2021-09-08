package com.mengying;

public class gdb {
    int g(int m,int n){
        if(m<n)
        {
            g(n,m);
        }
        if(n==0)
        {
            return m;
        }
        else return g(n,m%n);
    }
}
