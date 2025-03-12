public class Mountains extends Location {

    @Override
    public void showAllPokemon() {
        System.out.println("Pokemon i bjergene");
        for (Pokemon p : this.pokemonList) {
            System.out.println(p);
        }
    }
}
