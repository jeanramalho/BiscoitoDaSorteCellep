package br.com.jeanramalho.projetofinalcurso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         // pegando as referencias via if
        val edtMainFrase : TextView = findViewById(R.id.edtMainFrase)
        val btnMainBotao : Button = findViewById(R.id.btnMainBotao)

        //criando variavel com frases
        val frase1 = "A vida trará coisas boas se tiveres paciência."
        val frase2 = "Demonstre amor e alegria em todas as oportunidades e verás que a paz nasce dentro de você."
        val frase3 = "Não compense na ira o que lhe falta na razão."
        val frase4 = "Defeitos e virtudes são apenas dois lados da mesma moeda."
        val frase5 = "A maior de todas as torres começa no solo."
        val frase6 = "Não há que ser forte. Há que ser flexível."
        val frase7 = "Gente todo dia arruma os cabelos, por que não o coração?"
        val frase8 = "Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida."
        val frase9 = "A juventude não é uma época da vida, é um estado de espírito."
        val frase10 = "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos."
        val frase11 = "Dê toda a atenção para a formação dos teus filhos, sobretudo por exemplos de tua própria vida."
        val frase12 = "Siga os bons e aprenda com eles."
        val frase13 = "Não importa o tamanho da montanha, ela não pode tapar o sol."
        val frase14 = "O bom-senso vai mais longe do que muito conhecimento."
        val frase15 = "Quem quer colher rosas deve suportar os espinhos."
        val frase16 = "São os nossos amigos que nos ensinam as mais valiosas lições."

        //criando lista de frases
        val frases = arrayListOf(frase2, frase3, frase4, frase5, frase6, frase7, frase8, frase9, frase10, frase11, frase12, frase13, frase14, frase15, frase16)

        edtMainFrase.text = frases.random()

        //criando listener para botão
        btnMainBotao.setOnClickListener {


           edtMainFrase.text = frases.random()
        }
    }
}