import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] pokemon = new String[n];
        int[] needCandi = new int[n];
        int[] haveCandi = new int[n];
        int[] pokemonEv = new int[n];
        
        for (int i = 0; i < n; i++) {
            pokemon[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            needCandi[i] = Integer.parseInt(st.nextToken());
            haveCandi[i] = Integer.parseInt(st.nextToken());
        }

        int evolution = 0;

        for (int i = 0; i < n; i++){
            while (haveCandi[i] >= needCandi[i]) {
                evolution++;
                pokemonEv[i]++;
                haveCandi[i] = haveCandi[i] - needCandi[i] + 2;
            }
        }
        
        int maxEv = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (pokemonEv[i] > maxEv) {
                maxEv = pokemonEv[i];
                maxIndex = i;
            }
        }

        System.out.println(evolution);
        System.out.println(pokemon[maxIndex]);
    }
}