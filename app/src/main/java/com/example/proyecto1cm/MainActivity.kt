/*  Rios Alcantara Samantha
    Taller Computo Movil
    Proyecto 1
*/

package com.example.proyecto1cm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    private lateinit var tVNombre: TextView
    private lateinit var tVNacimiento: TextView
    private lateinit var tVNumCta: TextView
    private lateinit var tVCorreo: TextView
    private lateinit var btnEnviar: Button
    private lateinit var etNombre: EditText
    private lateinit var etNacimientoDia: EditText
    private lateinit var etNacimientoMes: EditText
    private lateinit var etNacimientoYear: EditText
    private lateinit var etCta: EditText
    private lateinit var etCorreo: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //vinculaciones
        tVNombre = findViewById(R.id.tVNombre)
        tVNacimiento = findViewById(R.id.tVFechaNacimiento)
        tVNumCta = findViewById(R.id.tVNumCta)
        tVCorreo = findViewById(R.id.tVCorreo)
        btnEnviar = findViewById(R.id.btnEnviar)
        etNombre = findViewById(R.id.etNombre)
        etNacimientoDia = findViewById(R.id.etNacimientoDia)
        etNacimientoMes = findViewById(R.id.etNacimientoMes)
        etNacimientoYear = findViewById(R.id.etNacimientoYear)
        etCta = findViewById(R.id.etCta)
        etCorreo = findViewById(R.id.etCorreo)


    }

    fun clicks(view: android.view.View) {
        when(view.id){
            R.id.btnEnviar -> {
                //acciones al clickear el boton
                if(etNombre.text.toString() != "" && Integer.parseInt(etNacimientoDia.text.toString()) != 0 && Integer.parseInt(etNacimientoMes.text.toString()) != 0 && Integer.parseInt(etNacimientoYear.text.toString()) != 0 && Integer.parseInt(etCta.text.toString()) != 0 && etCorreo.text.toString() != "" ){
                    //los val obtienen los datos que se ingresan en los campos
                    val  name = etNombre.text.toString()
                    val bornday = Integer.parseInt(etNacimientoDia.text.toString())
                    val bornMes = Integer.parseInt(etNacimientoMes.text.toString())
                    val bornyear = Integer.parseInt(etNacimientoYear.text.toString())
                    val count = Integer.parseInt(etCta.text.toString())
                    val email = etCorreo.text.toString()

                    val intent = Intent(this,MainActivity2::class.java)

                    if(Integer.parseInt(etNacimientoDia.text.toString()) <= 31 && Integer.parseInt(etNacimientoDia.text.toString()) > 0){
                        if (Integer.parseInt(etNacimientoMes.text.toString()) >= 0 && Integer.parseInt(etNacimientoMes.text.toString()) <= 12){
                            //Para enviar los parametros al 2do activity
                            val parametros = Bundle()

                            parametros.putString("user",name)
                            parametros.putInt("userbornday",bornday)
                            parametros.putInt("userbornmonth",bornMes)
                            parametros.putInt("userbornyear",bornyear)
                            parametros.putInt("usercount",count)
                            parametros.putString("usermail",email)

                            intent.putExtras(parametros)

                            startActivity(intent)
                        }else{
                            etNacimientoMes.error = getString(R.string.errormsg3)
                        }

                    }else{
                        etNacimientoDia.error = getString(R.string.errormsg2)
                    }



                }else{
                    Toast.makeText( this,getString(R.string.toastmsg),Toast.LENGTH_LONG).show()
                    etNombre.error = getString(R.string.errormsg)
                    etNacimientoDia.error = getString(R.string.errormsg)
                    etNacimientoMes.error = getString(R.string.errormsg)
                    etNacimientoYear.error = getString(R.string.errormsg)
                    etCta.error = getString(R.string.errormsg)
                    etCorreo.error = getString(R.string.errormsg)
                }



            }

            else -> {
                //Opcion por defecto
                //Similar al default en un switch en java
            }
        }


    }
}