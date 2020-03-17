/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Backend;

import java.sql.*;

/**
 *
 * @author rizal
 */
public class PengawasGudang {
    private int id_user;
    private String nama_user,username,password;

    public PengawasGudang(String nama_user, String username, String password) {
        this.nama_user = nama_user;
        this.username = username;
        this.password = password;
    }

    public PengawasGudang() {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public PengawasGudang getById(int id){
        return null;
    }
    
    
    public void save(){
        if(getById(id_user).getId_user == 0){
            String SQL = "Insert into user (nama_user,username,password) values(" 
                    + " '" +this.nama_user + "', "
                    + " '" +this.username + "', "
                    + " '"+this.password+"' "
                    + " )";
                    this.id_user = DBHelper.insertQueryGetId(SQL);
        }
    }
}
