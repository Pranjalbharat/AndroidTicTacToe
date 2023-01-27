package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* test function
//    public void checkClick(View view){
//        Toast.makeText(getBaseContext(),"sandwitch",Toast.LENGTH_SHORT).show();
//        Toast.makeText(getBaseContext(),"running",Toast.LENGTH_SHORT).show();
//    }
    */


    public boolean turn = false;  // false for 'X' and true for 'O'
    public void changeTurn(){
        turn = !turn;
    }

    public void playPop(){
        MediaPlayer pop = MediaPlayer.create(getApplicationContext(),R.raw.pop);
        pop.start();
    }

    // button functions
    public void buttonFunction1(View view){
        int n=1;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction2(View view){
        int n=2;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction3(View view){
        int n=3;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction4(View view){
        int n=4;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction5(View view){
        int n=5;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction6(View view){
        int n=6;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction7(View view){
        int n=7;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction8(View view){
        int n=8;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }
    public void buttonFunction9(View view){
        int n=9;
        visiblity(n);
        playPop();
        changeTurn();
        gameArr();
        view.setEnabled(false);
    }


    // onclick visiblity
    public void visiblity( int n ){
        if(n==1){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross1);
            }
            else{
                v = findViewById(R.id.zero1);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==2){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross2);
            }
            else{
                v = findViewById(R.id.zero2);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==3){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross3);
            }
            else{
                v = findViewById(R.id.zero3);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==4){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross4);
            }
            else{
                v = findViewById(R.id.zero4);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==5){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross5);
            }
            else{
                v = findViewById(R.id.zero5);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==6){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross6);
            }
            else{
                v = findViewById(R.id.zero6);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==7){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross7);
            }
            else{
                v = findViewById(R.id.zero7);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==8){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross8);
            }
            else{
                v = findViewById(R.id.zero8);
            }
            v.setVisibility(View.VISIBLE);
        }
        if(n==9){
            View v;
            if(turn==false){
                v = findViewById(R.id.cross9);
            }
            else{
                v = findViewById(R.id.zero9);
            }
            v.setVisibility(View.VISIBLE);
        }




    }


    // winning logic
    public void gameArr(){
        int game[]=new int[9];

        View v1 = findViewById(R.id.zero1);
        View v2 = findViewById(R.id.zero2);
        View v3 = findViewById(R.id.zero3);
        View v4 = findViewById(R.id.zero4);
        View v5 = findViewById(R.id.zero5);
        View v6 = findViewById(R.id.zero6);
        View v7 = findViewById(R.id.zero7);
        View v8 = findViewById(R.id.zero8);
        View v9 = findViewById(R.id.zero9);
        View x1 = findViewById(R.id.cross1);
        View x2 = findViewById(R.id.cross2);
        View x3 = findViewById(R.id.cross3);
        View x4 = findViewById(R.id.cross4);
        View x5 = findViewById(R.id.cross5);
        View x6 = findViewById(R.id.cross6);
        View x7 = findViewById(R.id.cross7);
        View x8 = findViewById(R.id.cross8);
        View x9 = findViewById(R.id.cross9);

        if(v1.getVisibility()==View.VISIBLE){
            game[0] = 0;
        }
        else if(x1.getVisibility()==View.VISIBLE){
            game[0] = 1;
        }
        else{
            game[0] = -1;
        }
        if(v2.getVisibility()==View.VISIBLE){
            game[1] = 0;
        }
        else if(x2.getVisibility()==View.VISIBLE){
            game[1] = 1;
        }
        else{
            game[1] = -1;
        }
        if(v3.getVisibility()==View.VISIBLE){
            game[2] = 0;
        }
        else if(x3.getVisibility()==View.VISIBLE){
            game[2] = 1;
        }
        else{
            game[2] = -1;
        }
        if(v4.getVisibility()==View.VISIBLE){
            game[3] = 0;
        }
        else if(x4.getVisibility()==View.VISIBLE){
            game[3] = 1;
        }
        else{
            game[3] = -1;
        }
        if(v5.getVisibility()==View.VISIBLE){
            game[4] = 0;
        }
        else if(x5.getVisibility()==View.VISIBLE){
            game[4] = 1;
        }
        else{
            game[4] = -1;
        }
        if(v6.getVisibility()==View.VISIBLE){
            game[5] = 0;
        }
        else if(x6.getVisibility()==View.VISIBLE){
            game[5] = 1;
        }
        else{
            game[5] = -1;
        }
        if(v7.getVisibility()==View.VISIBLE){
            game[6] = 0;
        }
        else if(x7.getVisibility()==View.VISIBLE){
            game[6] = 1;
        }
        else{
            game[6] = -1;
        }
        if(v8.getVisibility()==View.VISIBLE){
            game[7] = 0;
        }
        else if(x8.getVisibility()==View.VISIBLE){
            game[7] = 1;
        }
        else{
            game[7] = -1;
        }
        if(v9.getVisibility()==View.VISIBLE){
            game[8] = 0;
        }
        else if(x9.getVisibility()==View.VISIBLE){
            game[8] = 1;
        }
        else{
            game[8] = -1;
        }
        if(checkDraw(game)){
            Toast.makeText(getBaseContext(),"Draw! :/", Toast.LENGTH_LONG).show();
            resetActivity();
        }

        String str_zero = getZero(game);
        String str_cross = getCross(game);

        checkWin(str_zero,str_cross);

    }

    public boolean checkDraw(int game[]){

        for (int i = 0; i < game.length; i++) {
            if(game[i]==-1){
                return false;
            }
        }
        return  true;
    }

    public String getZero(int[] game){
        String str_zero = "";
        for (int i = 0; i < game.length; i++) {
            if(game[i]==0){
                str_zero += (i+1);
            }
        }
        return str_zero;
    }
    public String getCross(int[] game){
        String str_cross = "";
        for (int i = 0; i < game.length; i++) {
            if(game[i]==1){
                str_cross += (i+1);
            }
        }
        return str_cross;
    }
    public void winSound(){
        MediaPlayer win=MediaPlayer.create(getApplicationContext(),R.raw.win);
        win.start();
    }

    public void checkWin( String str_zero, String str_cross){

        //zero
        if(str_zero.contains("1") && str_zero.contains("2") && str_zero.contains("3") ) {
            // zero win

            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();


            resetActivity();
        }
        if(str_zero.contains("4") && str_zero.contains("5") && str_zero.contains("6") ) {
            // zero win
            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();

            resetActivity();        }
        if(str_zero.contains("7") && str_zero.contains("8") && str_zero.contains("9") ) {
            // zero win
            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();

            resetActivity();        }
        if(str_zero.contains("3") && str_zero.contains("5") && str_zero.contains("7") ) {
            // zero win
            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();

            resetActivity();        }
        if(str_zero.contains("1") && str_zero.contains("4") && str_zero.contains("7") ) {
            // zero win
            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();

            resetActivity();        }
        if(str_zero.contains("2") && str_zero.contains("5") && str_zero.contains("8") ) {
            // zero win
            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();

            resetActivity();        }
        if(str_zero.contains("3") && str_zero.contains("6") && str_zero.contains("9") ) {
            // zero win
            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();

            resetActivity();        }
        if(str_zero.contains("1") && str_zero.contains("5") && str_zero.contains("9") ) {
            // zero win
            winSound();
            Toast.makeText(getBaseContext(),"zero Win!",Toast.LENGTH_LONG).show();
            resetActivity();
        }

        //cross
        if(str_cross.contains("1") && str_cross.contains("2") && str_cross.contains("3") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();

        }
        if(str_cross.contains("4") && str_cross.contains("5") && str_cross.contains("6") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();
        }
        if(str_cross.contains("7") && str_cross.contains("8") && str_cross.contains("9") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();
        }
        if(str_cross.contains("3") && str_cross.contains("5") && str_cross.contains("7") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();
        }
        if(str_cross.contains("1") && str_cross.contains("4") && str_cross.contains("7") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();
        }
        if(str_cross.contains("2") && str_cross.contains("5") && str_cross.contains("8") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();
        }
        if(str_cross.contains("3") && str_cross.contains("6") && str_cross.contains("9") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();
        }
        if(str_cross.contains("1") && str_cross.contains("5") && str_cross.contains("9") ) {
            // cross win
            winSound();
            Toast.makeText(getBaseContext(),"cross Win!",Toast.LENGTH_LONG).show();
            resetActivity();

        }

    }

    public void resetActivity(){
        finish();
        startActivity(getIntent());
    }

}