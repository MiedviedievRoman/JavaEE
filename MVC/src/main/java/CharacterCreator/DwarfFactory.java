/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public Dwarf create() {
        return new Dwarf();
    }
}
