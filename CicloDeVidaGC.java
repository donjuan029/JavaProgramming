public class CicloDeVidaGC {
    
    //Objeto 1: Referência local
    public static void processarDados() {
        //Ponto A: O objeto é criado e alocado.
        ObjetoGrande objA = new ObjetoGrande(1); 
        
        //Simula um uso curto.
        objA.usar(); 
        
        //O método termina. A referência local 'objA' é perdida do Stack.
        //O objeto no Heap está pronto para o GC.
    }
    
    //Objeto 2: Objeto que sobrevive
    public static void manterReferencia() {
        ObjetoGrande objB = new ObjetoGrande(2); 
        //Armazenar objB em uma lista estática (referência global)
        Cache.adicionar(objB); 
        //A referência 'objB' é perdida do Stack, mas o objeto VIVE devido à referência em Cache.
    }

    //Estrutura de exemplo para simular o Cache
    static class Cache {
        private static java.util.List<ObjetoGrande> referencias = new java.util.ArrayList<>();
        public static void adicionar(ObjetoGrande obj) {
            referencias.add(obj);
        }
    }
    
    static class ObjetoGrande {
        @SuppressWarnings("unused")
        private int id;
        public ObjetoGrande(int id) { this.id = id; }
        public void usar() { /* ... */ }
    }
}
