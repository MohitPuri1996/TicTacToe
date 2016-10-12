package com.example.lenovo.tictactoe;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn11, btn12, btn13, btn21, btn22, btn23, btn31, btn32, btn33;
    static int cnt11 = 0,cnt12=0;//cnt13=0,cnt21=0,cnt22=0,cnt23=0,cnt31=0,cnt32=0,cnt33=0;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//cnt11++;

        txt = (TextView) findViewById(R.id.textView);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn21 = (Button) findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn31 = (Button) findViewById(R.id.btn31);
        btn32 = (Button) findViewById(R.id.btn32);
        btn33 = (Button) findViewById(R.id.btn33);
        if (cnt11 % 2 == 0) {
            txt.setText("player 1");

        } else
            txt.setText("player 2");

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt11++;
                if (cnt11 % 2 != 0)
                    btn11.setText("O");
                else
                    btn11.setText("X");
                check();

            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn12.setText("O");
                else
                    btn12.setText("X");
                //Thread.sleep(1000);
                check();
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn13.setText("O");
                else
                    btn13.setText("X");
                //Thread.sleep(1000);
                check();
            }
        });

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn21.setText("O");
                else
                    btn21.setText("X");
           //     Thread.sleep(1000);
                check();
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn22.setText("O");
                else
                    btn22.setText("X");
             //   Thread.sleep(1000);
                check();
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn23.setText("O");
                else
                    btn23.setText("X");
               // Thread.sleep(1000);
                check();
            }
        });
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn31.setText("O");
                else
                    btn31.setText("X");
                //Thread.sleep(1000);
                check();
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn32.setText("O");
                else
                    btn32.setText("X");
                //Thread.sleep(1000);
                check();
            }
        });

        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++cnt11;
                if (cnt11 % 2 != 0)
                    btn33.setText("O");
                else
                    btn33.setText("X");
                check();
            }

        });

}


    void check() {
        try {
            if (((btn31.getText().equals("X")) && (btn32.getText().equals("X")) && btn33.getText().equals("X"))) {

                Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();
                btn33.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn32.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn31.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                //Thread.sleep(3000);



                clear();
                open();
            } else if ((btn11.getText().equals("X")) && (btn12.getText().equals("X")) && (btn13.getText().equals("X"))) {
                Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();

                btn11.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn12.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn13.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                // Thread.sleep(3000);
                 clear();
                open();
            } else if ((btn11.getText().equals("X")) && (btn21.getText().equals("X")) && (btn31.getText().equals("X"))) {
                Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();
                btn11.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn21.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn31.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                //Thread.sleep(3000);
                open();
                clear();

            } else if ((btn11.getText().equals("X")) && (btn22.getText().equals("X")) && (btn33.getText().equals("X"))) {
                Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();
                btn11.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn33.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                //Thread.sleep(3000);
                 open();
                  clear();
            } else if (((btn21.getText().equals("X")) && (btn22.getText().equals("X")) && btn23.getText().equals("X"))) {
                Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();
                btn21.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn23.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                // Thread.sleep(3000);
                 clear();
                open();
            } else if (((btn13.getText().equals("X")) && (btn23.getText().equals("X")) && btn33.getText().equals("X"))) {
                clear();
                btn13.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn23.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn33.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();
                // Thread.sleep(3000);
                   open();
            } else if (((btn12.getText().equals("X")) && (btn22.getText().equals("X")) && btn32.getText().equals("X"))) {
                Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();
                btn12.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                btn32.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                // Thread.sleep(3000);
                   clear();
                open();
            } else {
                if (((btn13.getText().equals("X")) && (btn22.getText().equals("X")) && btn31.getText().equals("X"))) {
                    Toast.makeText(this, "player with X won the match", Toast.LENGTH_SHORT).show();
                    btn13.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    btn31.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                    //  Thread.sleep(3000);

                    open();
                       clear();
                } else {
                    if ((btn11.getText().equals("O")) && (btn12.getText().equals("O")) && (btn13.getText().equals("O"))) {
                           clear();

                        btn11.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn12.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn13.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        //Thread.sleep(3000);
                          open();
                    } else if ((btn11.getText().equals("O")) && (btn21.getText().equals("O")) && (btn31.getText().equals("O"))) {
                        btn11.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn21.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn31.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        // Thread.sleep(3000);
                         clear();
                        open();
                    } else if ((btn11.getText().equals("O")) && (btn22.getText().equals("O")) && (btn33.getText().equals("O"))) {
                        btn11.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn33.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        //Thread.sleep(3000);
                          clear();
                        open();
                    } else if ((btn21.getText().equals("O")) && (btn22.getText().equals("O")) && (btn23.getText().equals("O"))) {
                        btn21.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn23.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        //Thread.sleep(3000);
                        clear();open();
                    } else if ((btn31.getText().equals("O")) && (btn32.getText().equals("O")) && (btn33.getText().equals("O"))) {
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        btn31.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn32.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn33.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        //Thread.sleep(3000);
                        clear();
                        open();
                    } else if ((btn13.getText().equals("O")) && (btn23.getText().equals("O")) && (btn33.getText().equals("O"))) {
                        btn13.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn23.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn33.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        // Thread.sleep(3000);
                        clear();
                         open();
                    } else if ((btn12.getText().equals("O")) && (btn22.getText().equals("O")) && (btn32.getText().equals("O"))) {
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        btn12.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn32.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        //      Thread.sleep(3000);
                        clear();
                        open();
                    } else if ((btn13.getText().equals("O")) && (btn22.getText().equals("O")) && (btn31.getText().equals("O"))) {
                        btn13.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn22.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        btn31.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
                        Toast.makeText(this, "player with O won the match", Toast.LENGTH_SHORT).show();
                        //    Thread.sleep(3000);
                        clear();
                           open();
                    }


                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    void clear() {
        btn11.setText(" ");
        btn12.setText(" ");
        btn13.setText(" ");
        btn21.setText(" ");

        btn22.setText(" ");
        btn23.setText(" ");
        btn31.setText(" ");
        btn32.setText(" ");
        btn33.setText(" ");

    }

    public void open() {
        try {


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

            alertDialogBuilder.setMessage("Restart Game");

            alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    btn11.setText(" ");
                    btn12.setText(" ");
                    btn13.setText(" ");
                    btn21.setText(" ");
                    btn22.setText(" ");
                    btn23.setText(" ");
                    btn31.setText(" ");
                    btn32.setText(" ");
                    btn33.setText(" ");


                }
            });

            alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        } catch (Exception e) {
                e.printStackTrace();
            }
        }}