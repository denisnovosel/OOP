/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigger;

/**
 *
 * @author Kikiii
 */
public class Candidate {
    protected String cName;
    
    public Candidate(){
        this("");
    }
    
    public Candidate(String cName){
        this.cName=cName;
    }
    public String getName() {
        return cName;
    }
    public void setName(String cName) {
        this.cName = cName;
    }
}