package hello.advanced.app.v0;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryV0 {

    public void save(String itemId){

        if(itemId.equals("ex")){
            throw new IllegalStateException("μμΈλ°μ");
        }
        sleep(500);
    }

    private void sleep(long milli){
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
