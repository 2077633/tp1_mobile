package cstjean.mobile.tp1.data

data class Entrainement(
    val titre: String,
    val typeActivite: String,
    val lieu: String,
    val exterieur: Boolean,
    val intensite: Int,
    val notes: String
)