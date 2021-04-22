package models

class Vogon(_name: String, _surname: String) {
    val name: String = _name
    val surname: String = _surname
    var rested: Boolean = false
    var readyToVileness: Boolean = false

    fun smile(){
        tryToRememberHowToSmile()
        println("$surname $name smiles slowly")
    }

    private fun tryToRememberHowToSmile(){
        println("Operation aborted, $surname $name do not remember how to smile")
    }

    fun pamperVogonHimself(captives: Captives){
        if(captives.areExist){
            println("Vogon $surname $name shouted at captives")
            rested = true
            readyToVileness = true
        }else println("no captives to shout at and pamper")
    }

    fun checkVogonsCondition(){
        if(rested)
            println("$surname $name is rested")
        if(readyToVileness)
            println("$surname $name ready to vileness")
    }

}