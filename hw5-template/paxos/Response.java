package paxos;

import java.io.Serializable;

/**
 * Please fill in the data structure you use to represent the response message for each RMI call.
 * Hint: You may need a boolean variable to indicate ack of acceptors and also you may need proposal number and value.
 * Hint: Make it more generic such that you can use it for each RMI call.
 */
public class Response implements Serializable {
    static final long serialVersionUID = 2L;
    // Your data here
    public Boolean ok; //true for ok, false for reject
    public int n;
    public int na;
    public int va;
    // Your constructor and methods here
    //when rejecting the n variable becomes highest seen np
    public Response(Boolean ok, int np){
        this.ok = ok;
        this.n = np;
    }

    public Response(Boolean ok, int n, int na, int va){
        this(ok, n);
        this.na = na;
        this.va = va;
    }
}
