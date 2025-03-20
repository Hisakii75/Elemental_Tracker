package org.example;

public class Monster {
    String Name;
    String ElementWeak1Star;
    String ElementWeak2Star;
    String ElementWeak3Star;
    String ElementNulled;

    Monster(){
        this.Name               = "";
        this.ElementWeak3Star   = "";
        this.ElementWeak2Star   = "";
        this.ElementWeak1Star   = "";
        this.ElementNulled      = "";
    }

}

class Chatacabra extends Monster {
    Chatacabra() {
        this.Name = "Chatacabra";
        this.ElementWeak3Star = "Thunder";
        this.ElementWeak2Star = "Ice Fire";
        this.ElementWeak1Star = "Water";
        this.ElementNulled = "Dragon";
    }
}

class Quematrice extends Monster {
    Quematrice() {
        this.Name = "Quematrice";
        this.ElementWeak3Star = "Water";
        this.ElementWeak2Star = "Ice";
        this.ElementWeak1Star = "Thunder Dragon";
        this.ElementNulled = "Fire";
    }
}

class LalaBarina extends Monster {
    LalaBarina() {
        this.Name = "Lala Barina";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Ice";
        this.ElementNulled = "Water Dragon";
    }
}

class Congalala extends Monster {
    Congalala() {
        this.Name = "Congalala";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Ice";
        this.ElementWeak1Star = "Thunder Water Dragon";
        this.ElementNulled = "None";
    }
}

class Balahara extends Monster {
    Balahara() {
        this.Name = "Balahara";
        this.ElementWeak3Star = "Thunder";
        this.ElementWeak2Star = "Fire";
        this.ElementWeak1Star = "Ice Dragon";
        this.ElementNulled = "Water";
    }
}

class Doshaguma extends Monster {
    Doshaguma() {
        this.Name = "Doshaguma";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Thunder Water Ice";
        this.ElementWeak1Star = "Dragon";
        this.ElementNulled = "None";
    }
}

class UthDuna extends Monster {
    UthDuna() {
        this.Name = "Uth Duna";
        this.ElementWeak3Star = "Thunder";
        this.ElementWeak2Star = "Fire";
        this.ElementWeak1Star = "Ice Dragon";
        this.ElementNulled = "Water";
    }
}

class Rompopolo extends Monster {
    Rompopolo() {
        this.Name = "Rompopolo";
        this.ElementWeak3Star = "Water";
        this.ElementWeak2Star = "Fire Thunder Ice";
        this.ElementWeak1Star = "Dragon";
        this.ElementNulled = "None";
    }
}

class ReyDau extends Monster {
    ReyDau() {
        this.Name = "Rey Dau";
        this.ElementWeak3Star = "Ice";
        this.ElementWeak2Star = "Water";
        this.ElementWeak1Star = "Fire Dragon";
        this.ElementNulled = "Thunder";
    }
}

class Nerscylla extends Monster {
    Nerscylla() {
        this.Name = "Nerscylla";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Ice";
        this.ElementNulled = "Water Dragon";
    }
}

class Hirabami extends Monster {
    Hirabami() {
        this.Name = "Hirabami";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Water Dragon";
        this.ElementNulled = "Ice";
    }
}

class Ajarakan extends Monster {
    Ajarakan() {
        this.Name = "Ajarakan";
        this.ElementWeak3Star = "Water";
        this.ElementWeak2Star = "Ice Dragon";
        this.ElementWeak1Star = "Thunder";
        this.ElementNulled = "Fire";
    }
}

class NuUdra extends Monster {
    NuUdra() {
        this.Name = "Nu Udra";
        this.ElementWeak3Star = "Water";
        this.ElementWeak2Star = "Thunder Dragon";
        this.ElementWeak1Star = "Ice";
        this.ElementNulled = "Fire";
    }
}

class GuardianDoshaguma extends Monster {
    GuardianDoshaguma() {
        this.Name = "Guardian Doshaguma";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Ice";
        this.ElementWeak1Star = "Thunder Dragon Water";
        this.ElementNulled = "None";
    }
}

class GuardianRathalos extends Monster {
    GuardianRathalos() {
        this.Name = "Guardian Rathalos";
        this.ElementWeak3Star = "Dragon";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Water Ice";
        this.ElementNulled = "Fire";
    }
}

class GuardianEbonyOdoragon extends Monster {
    GuardianEbonyOdoragon() {
        this.Name = "Guardian Ebony Odoragon";
        this.ElementWeak3Star = "Water";
        this.ElementWeak2Star = "Fire Thunder Ice";
        this.ElementWeak1Star = "Dragon";
        this.ElementNulled = "None";
    }
}

class XuWu extends Monster {
    XuWu() {
        this.Name = "Xu Wu";
        this.ElementWeak3Star = "Ice";
        this.ElementWeak2Star = "Fire Thunder";
        this.ElementWeak1Star = "Water";
        this.ElementNulled = "Dragon";
    }
}

class GuardianArkveld extends Monster {
    GuardianArkveld() {
        this.Name = "Guardian Arkveld";
        this.ElementWeak3Star = "Dragon";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Fire Water Ice";
        this.ElementNulled = "None";
    }
}

class GuardianFulgurAnjanath extends Monster {
    GuardianFulgurAnjanath() {
        this.Name = "Guardian Fulgur Anjanath";
        this.ElementWeak3Star = "Ice";
        this.ElementWeak2Star = "Dragon";
        this.ElementWeak1Star = "Water Fire";
        this.ElementNulled = "Thunder";
    }
}

class ZohShia extends Monster {
    ZohShia() {
        this.Name = "Zoh Shia";
        this.ElementWeak3Star = "Dragon";
        this.ElementWeak2Star = "Fire Ice";
        this.ElementWeak1Star = "Water Thunder";
        this.ElementNulled = "None";
    }
}

class YianKutKu extends Monster {
    YianKutKu() {
        this.Name = "Yian Kut-Ku";
        this.ElementWeak3Star = "Ice";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Water Fire";
        this.ElementNulled = "Dragon";
    }
}

class Gypceros extends Monster {
    Gypceros() {
        this.Name = "Gypceros";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Ice";
        this.ElementWeak1Star = "Dragon Water";
        this.ElementNulled = "Thunder";
    }
}

class Rathian extends Monster {
    Rathian() {
        this.Name = "Rathian";
        this.ElementWeak3Star = "Dragon";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Water Ice";
        this.ElementNulled = "Fire";
    }
}

class Rathalos extends Monster {
    Rathalos() {
        this.Name = "Rathalos";
        this.ElementWeak3Star = "Dragon";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Water Ice";
        this.ElementNulled = "Fire";
    }
}

class Gravios extends Monster {
    Gravios() {
        this.Name = "Gravios";
        this.ElementWeak3Star = "Water";
        this.ElementWeak2Star = "Dragon";
        this.ElementWeak1Star = "Thunder Ice";
        this.ElementNulled = "Fire";
    }
}

class Blangonga extends Monster {
    Blangonga() {
        this.Name = "Blangonga";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Water";
        this.ElementNulled = "Ice Dragon";
    }
}

class JinDahaad extends Monster {
    JinDahaad() {
        this.Name = "Jin Dahaad";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Water Thunder Dragon";
        this.ElementWeak1Star = "None";
        this.ElementNulled = "Ice";
    }
}

class GoreMagala extends Monster {
    GoreMagala() {
        this.Name = "Gore Magala";
        this.ElementWeak3Star = "Fire";
        this.ElementWeak2Star = "Dragon Thunder";
        this.ElementWeak1Star = "Ice";
        this.ElementNulled = "Water";
    }
}

class Arkveld extends Monster {
    Arkveld() {
        this.Name = "Arkveld";
        this.ElementWeak3Star = "Dragon";
        this.ElementWeak2Star = "Thunder";
        this.ElementWeak1Star = "Fire Water Ice";
        this.ElementNulled = "None";
    }
}
