public class Trainer {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public void searchForPokemon(location location, String searchType, String value) {
        Pokemon foundPokemon = null;

        if (searchType.equalsIgnoreCase("name")) {
            foundPokemon = location.searchPokemonByName(value);
        } else if (searchType.equalsIgnoreCase("type")) {
            foundPokemon = location.searchPokemonByType(value);
        }

        if (foundPokemon != null) {
            System.out.println(name + " fandt en " + foundPokemon);
        } else {
            System.out.println(name + " kunne ikke finde en Pokémon med " + searchType + " '" + value + "'.");
        }
    }
}
