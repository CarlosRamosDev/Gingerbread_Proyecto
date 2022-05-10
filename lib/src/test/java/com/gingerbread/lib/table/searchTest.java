package com.gingerbread.lib.table;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class searchTest {

    @Test
    void searchElementByNumberAtomic() {
        assertEquals("H", Objects.requireNonNull(search.searchElementByNumberAtomic(1)).getSymbol());
        assertEquals("He", Objects.requireNonNull(search.searchElementByNumberAtomic(2)).getSymbol());
        assertEquals("Li", Objects.requireNonNull(search.searchElementByNumberAtomic(3)).getSymbol());
        assertEquals("Be", Objects.requireNonNull(search.searchElementByNumberAtomic(4)).getSymbol());
        assertEquals("B", Objects.requireNonNull(search.searchElementByNumberAtomic(5)).getSymbol());
        assertEquals("C", Objects.requireNonNull(search.searchElementByNumberAtomic(6)).getSymbol());
        assertEquals("N", Objects.requireNonNull(search.searchElementByNumberAtomic(7)).getSymbol());
        assertEquals("O", Objects.requireNonNull(search.searchElementByNumberAtomic(8)).getSymbol());
        assertEquals("F", Objects.requireNonNull(search.searchElementByNumberAtomic(9)).getSymbol());
        assertEquals("Ne", Objects.requireNonNull(search.searchElementByNumberAtomic(10)).getSymbol());
        assertEquals("Na", Objects.requireNonNull(search.searchElementByNumberAtomic(11)).getSymbol());
        assertEquals("Mg", Objects.requireNonNull(search.searchElementByNumberAtomic(12)).getSymbol());
        assertEquals("Al", Objects.requireNonNull(search.searchElementByNumberAtomic(13)).getSymbol());
        assertEquals("Si", Objects.requireNonNull(search.searchElementByNumberAtomic(14)).getSymbol());
        assertEquals("P", Objects.requireNonNull(search.searchElementByNumberAtomic(15)).getSymbol());
        assertEquals("S", Objects.requireNonNull(search.searchElementByNumberAtomic(16)).getSymbol());
        assertEquals("Cl", Objects.requireNonNull(search.searchElementByNumberAtomic(17)).getSymbol());
        assertEquals("Ar", Objects.requireNonNull(search.searchElementByNumberAtomic(18)).getSymbol());
        assertEquals("K", Objects.requireNonNull(search.searchElementByNumberAtomic(19)).getSymbol());
        assertEquals("Ca", Objects.requireNonNull(search.searchElementByNumberAtomic(20)).getSymbol());
        assertEquals("Sc", Objects.requireNonNull(search.searchElementByNumberAtomic(21)).getSymbol());
        assertEquals("Ti", Objects.requireNonNull(search.searchElementByNumberAtomic(22)).getSymbol());
        assertEquals("V", Objects.requireNonNull(search.searchElementByNumberAtomic(23)).getSymbol());
        assertEquals("Cr", Objects.requireNonNull(search.searchElementByNumberAtomic(24)).getSymbol());
        assertEquals("Mn", Objects.requireNonNull(search.searchElementByNumberAtomic(25)).getSymbol());
        assertEquals("Fe", Objects.requireNonNull(search.searchElementByNumberAtomic(26)).getSymbol());
        assertEquals("Co", Objects.requireNonNull(search.searchElementByNumberAtomic(27)).getSymbol());
        assertEquals("Ni", Objects.requireNonNull(search.searchElementByNumberAtomic(28)).getSymbol());
        assertEquals("Cu", Objects.requireNonNull(search.searchElementByNumberAtomic(29)).getSymbol());
        assertEquals("Zn", Objects.requireNonNull(search.searchElementByNumberAtomic(30)).getSymbol());
        assertEquals("Ga", Objects.requireNonNull(search.searchElementByNumberAtomic(31)).getSymbol());
        assertEquals("Ge", Objects.requireNonNull(search.searchElementByNumberAtomic(32)).getSymbol());
        assertEquals("As", Objects.requireNonNull(search.searchElementByNumberAtomic(33)).getSymbol());
        assertEquals("Se", Objects.requireNonNull(search.searchElementByNumberAtomic(34)).getSymbol());
        assertEquals("Br", Objects.requireNonNull(search.searchElementByNumberAtomic(35)).getSymbol());
        assertEquals("Kr", Objects.requireNonNull(search.searchElementByNumberAtomic(36)).getSymbol());
        assertEquals("Rb", Objects.requireNonNull(search.searchElementByNumberAtomic(37)).getSymbol());
        assertEquals("Sr", Objects.requireNonNull(search.searchElementByNumberAtomic(38)).getSymbol());
        assertEquals("Y", Objects.requireNonNull(search.searchElementByNumberAtomic(39)).getSymbol());
        assertEquals("Zr", Objects.requireNonNull(search.searchElementByNumberAtomic(40)).getSymbol());
        assertEquals("Nb", Objects.requireNonNull(search.searchElementByNumberAtomic(41)).getSymbol());
        assertEquals("Mo", Objects.requireNonNull(search.searchElementByNumberAtomic(42)).getSymbol());
        assertEquals("Tc", Objects.requireNonNull(search.searchElementByNumberAtomic(43)).getSymbol());
        assertEquals("Ru", Objects.requireNonNull(search.searchElementByNumberAtomic(44)).getSymbol());
        assertEquals("Rh", Objects.requireNonNull(search.searchElementByNumberAtomic(45)).getSymbol());
        assertEquals("Pd", Objects.requireNonNull(search.searchElementByNumberAtomic(46)).getSymbol());
        assertEquals("Ag", Objects.requireNonNull(search.searchElementByNumberAtomic(47)).getSymbol());
        assertEquals("Cd", Objects.requireNonNull(search.searchElementByNumberAtomic(48)).getSymbol());
        assertEquals("In", Objects.requireNonNull(search.searchElementByNumberAtomic(49)).getSymbol());
        assertEquals("Sn", Objects.requireNonNull(search.searchElementByNumberAtomic(50)).getSymbol());
        assertEquals("Sb", Objects.requireNonNull(search.searchElementByNumberAtomic(51)).getSymbol());
        assertEquals("Te", Objects.requireNonNull(search.searchElementByNumberAtomic(52)).getSymbol());
        assertEquals("I", Objects.requireNonNull(search.searchElementByNumberAtomic(53)).getSymbol());
        assertEquals("Xe", Objects.requireNonNull(search.searchElementByNumberAtomic(54)).getSymbol());
        assertEquals("Cs", Objects.requireNonNull(search.searchElementByNumberAtomic(55)).getSymbol());
        assertEquals("Ba", Objects.requireNonNull(search.searchElementByNumberAtomic(56)).getSymbol());
        assertEquals("La", Objects.requireNonNull(search.searchElementByNumberAtomic(57)).getSymbol());
        assertEquals("Ce", Objects.requireNonNull(search.searchElementByNumberAtomic(58)).getSymbol());
        assertEquals("Pr", Objects.requireNonNull(search.searchElementByNumberAtomic(59)).getSymbol());
        assertEquals("Nd", Objects.requireNonNull(search.searchElementByNumberAtomic(60)).getSymbol());
        assertEquals("Pm", Objects.requireNonNull(search.searchElementByNumberAtomic(61)).getSymbol());
        assertEquals("Sm", Objects.requireNonNull(search.searchElementByNumberAtomic(62)).getSymbol());
        assertEquals("Eu", Objects.requireNonNull(search.searchElementByNumberAtomic(63)).getSymbol());
        assertEquals("Gd", Objects.requireNonNull(search.searchElementByNumberAtomic(64)).getSymbol());
        assertEquals("Tb", Objects.requireNonNull(search.searchElementByNumberAtomic(65)).getSymbol());
        assertEquals("Dy", Objects.requireNonNull(search.searchElementByNumberAtomic(66)).getSymbol());
        assertEquals("Ho", Objects.requireNonNull(search.searchElementByNumberAtomic(67)).getSymbol());
        assertEquals("Er", Objects.requireNonNull(search.searchElementByNumberAtomic(68)).getSymbol());
        assertEquals("Tm", Objects.requireNonNull(search.searchElementByNumberAtomic(69)).getSymbol());
        assertEquals("Yb", Objects.requireNonNull(search.searchElementByNumberAtomic(70)).getSymbol());
        assertEquals("Lu", Objects.requireNonNull(search.searchElementByNumberAtomic(71)).getSymbol());
        assertEquals("Hf", Objects.requireNonNull(search.searchElementByNumberAtomic(72)).getSymbol());
        assertEquals("Ta", Objects.requireNonNull(search.searchElementByNumberAtomic(73)).getSymbol());
        assertEquals("W", Objects.requireNonNull(search.searchElementByNumberAtomic(74)).getSymbol());
        assertEquals("Re", Objects.requireNonNull(search.searchElementByNumberAtomic(75)).getSymbol());
        assertEquals("Os", Objects.requireNonNull(search.searchElementByNumberAtomic(76)).getSymbol());
        assertEquals("Ir", Objects.requireNonNull(search.searchElementByNumberAtomic(77)).getSymbol());
        assertEquals("Pt", Objects.requireNonNull(search.searchElementByNumberAtomic(78)).getSymbol());
        assertEquals("Au", Objects.requireNonNull(search.searchElementByNumberAtomic(79)).getSymbol());
        assertEquals("Hg", Objects.requireNonNull(search.searchElementByNumberAtomic(80)).getSymbol());
        assertEquals("Tl", Objects.requireNonNull(search.searchElementByNumberAtomic(81)).getSymbol());
        assertEquals("Pb", Objects.requireNonNull(search.searchElementByNumberAtomic(82)).getSymbol());
        assertEquals("Bi", Objects.requireNonNull(search.searchElementByNumberAtomic(83)).getSymbol());
        assertEquals("Po", Objects.requireNonNull(search.searchElementByNumberAtomic(84)).getSymbol());
        assertEquals("At", Objects.requireNonNull(search.searchElementByNumberAtomic(85)).getSymbol());
        assertEquals("Rn", Objects.requireNonNull(search.searchElementByNumberAtomic(86)).getSymbol());
        assertEquals("Fr", Objects.requireNonNull(search.searchElementByNumberAtomic(87)).getSymbol());
        assertEquals("Ra", Objects.requireNonNull(search.searchElementByNumberAtomic(88)).getSymbol());
        assertEquals("Ac", Objects.requireNonNull(search.searchElementByNumberAtomic(89)).getSymbol());
        assertEquals("Th", Objects.requireNonNull(search.searchElementByNumberAtomic(90)).getSymbol());
        assertEquals("Pa", Objects.requireNonNull(search.searchElementByNumberAtomic(91)).getSymbol());
        assertEquals("U", Objects.requireNonNull(search.searchElementByNumberAtomic(92)).getSymbol());
        assertEquals("Np", Objects.requireNonNull(search.searchElementByNumberAtomic(93)).getSymbol());
        assertEquals("Pu", Objects.requireNonNull(search.searchElementByNumberAtomic(94)).getSymbol());
        assertEquals("Am", Objects.requireNonNull(search.searchElementByNumberAtomic(95)).getSymbol());
        assertEquals("Cm", Objects.requireNonNull(search.searchElementByNumberAtomic(96)).getSymbol());
        assertEquals("Bk", Objects.requireNonNull(search.searchElementByNumberAtomic(97)).getSymbol());
        assertEquals("Cf", Objects.requireNonNull(search.searchElementByNumberAtomic(98)).getSymbol());
        assertEquals("Es", Objects.requireNonNull(search.searchElementByNumberAtomic(99)).getSymbol());
        assertEquals("Fm", Objects.requireNonNull(search.searchElementByNumberAtomic(100)).getSymbol());
        assertEquals("Md", Objects.requireNonNull(search.searchElementByNumberAtomic(101)).getSymbol());
        assertEquals("No", Objects.requireNonNull(search.searchElementByNumberAtomic(102)).getSymbol());
        assertEquals("Lr", Objects.requireNonNull(search.searchElementByNumberAtomic(103)).getSymbol());
        assertEquals("Rf", Objects.requireNonNull(search.searchElementByNumberAtomic(104)).getSymbol());
        assertEquals("Db", Objects.requireNonNull(search.searchElementByNumberAtomic(105)).getSymbol());
        assertEquals("Sg", Objects.requireNonNull(search.searchElementByNumberAtomic(106)).getSymbol());
        assertEquals("Bh", Objects.requireNonNull(search.searchElementByNumberAtomic(107)).getSymbol());
        assertEquals("Hs", Objects.requireNonNull(search.searchElementByNumberAtomic(108)).getSymbol());
        assertEquals("Mt", Objects.requireNonNull(search.searchElementByNumberAtomic(109)).getSymbol());
        assertEquals("Ds", Objects.requireNonNull(search.searchElementByNumberAtomic(110)).getSymbol());
        assertEquals("Rg", Objects.requireNonNull(search.searchElementByNumberAtomic(111)).getSymbol());
        assertEquals("Cn", Objects.requireNonNull(search.searchElementByNumberAtomic(112)).getSymbol());
        assertEquals("Uut", Objects.requireNonNull(search.searchElementByNumberAtomic(113)).getSymbol());
        assertEquals("Fl", Objects.requireNonNull(search.searchElementByNumberAtomic(114)).getSymbol());
        assertEquals("Uup", Objects.requireNonNull(search.searchElementByNumberAtomic(115)).getSymbol());
        assertEquals("Lv", Objects.requireNonNull(search.searchElementByNumberAtomic(116)).getSymbol());
        assertEquals("Uus", Objects.requireNonNull(search.searchElementByNumberAtomic(117)).getSymbol());
        assertEquals("Uuo", Objects.requireNonNull(search.searchElementByNumberAtomic(118)).getSymbol());
    }

    @Test
    void searchElementBySimbol() {

    }

    @Test
    void searchElementByName() {

    }
}