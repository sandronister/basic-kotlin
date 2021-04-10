package br.com.sandroni.utils

import br.com.sandroni.models.Employe

class BonusCalc {

    var total: Double = 0.0
        private set

    fun register(employe: Employe){
        this.total+=employe.bonus
    }
}