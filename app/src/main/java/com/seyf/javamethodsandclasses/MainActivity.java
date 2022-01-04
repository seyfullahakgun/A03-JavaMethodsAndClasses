package com.seyf.javamethodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String username;  // burada oluşturulan değişkenler bütün metodlarda geçerli


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");

        testMethod(); // aşağıda oluiturduğumuz metodlar çalışsın diye onCreate de çağırıypruz.

        System.out.println(math(3,5));

        System.out.println(newMethod("Atil"));

        username = "";


        makeMusicians();

        makeSimpsons();


    }

    public void makeSimpsons() {

        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        System.out.println(homer.getName());
        homer.setName("Homer Simpson");
        System.out.println(homer.getName());

    }


    public void makeMusicians() {

        //instance

        Musicians james = new Musicians("James","Guitar",50); // Constructor çağırdığımız için ilk başta gerekli değerli girmek gerekti
        System.out.println(james.instrument);

    }




    public void testMethod() {

        username = "Lars";
        int x = 4 + 4;
        x = 9;
        System.out.println("value of x: " + x);
    }

    public int math(int a, int b){

        username = "Kirk";
        int x = 11; // Metod içerisinde çağrılan değşken sadece o metodda kullanılabilir.
        System.out.println("value of x in math: " + x);
        return a + b;
    }

    public String newMethod(String string) {

        username = "Rob";

        return string + " new Method";
    }


    @Override
    protected void onResume() { // Andorid e özel oluşturulmuş metodlar.
        super.onResume();

        System.out.println("on resume called");

    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");

    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");

    }
}