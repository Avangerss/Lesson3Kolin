sealed class Character(
    val name: String, val weaponType: WeaponType
)
{
    class Warrior (val ability: OwerSrn) : Character (WARRIOR_NAME, WeaponType.SWORD)
    class Mage (val spell: OwerSrn) : Character (MAGE_NAME, WeaponType.STICK)
    class Archer (val ability: OwerSrn) : Character (ARCHER_NAME, WeaponType.BOW)

    companion object {
        const val WARRIOR_NAME = "Warrior"
        const val MAGE_NAME = "Mage"
        const val ARCHER_NAME = "Archer"
    }

}