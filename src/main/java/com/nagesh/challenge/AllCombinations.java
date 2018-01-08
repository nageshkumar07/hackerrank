package com.nagesh.challenge;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by nageshkumar
 * since  14/12/17.
 */
public class AllCombinations {
    public static void main(String[] args) throws IOException {

     /*   Map<String, Set<Object>> map = new HashMap<String, Set<Object>>() {{
            put("id", new HashSet<Object>() {{
                add(11);
                add(22);
            }});
            put("name", new HashSet<Object>() {{
                add("nagesh");
                add("kumar");
            }});
            put("place", new HashSet<Object>() {{
                add("venus");
                add("mars");
            }});
        }};*/

      //  String jsonRequestString = "{\n" + "  \"name\": [\n" + "    \"jim\",\n" + "    \"jam\"\n" + "  ],\n" + "  \"id\": [\n" + "    11,\n" + "    22\n" + "  ],\n" + "  \"place\": [\n" + "    \"venus\",\n" + "    \"mars\"\n" + "  ]\n" + "}";
        String jsonRequestString = fixture("request.json");
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Set<Object>> jsonToMap;
        jsonToMap = mapper.readValue(jsonRequestString, new TypeReference<Map<String, Set<Object>>>(){});


        List<Map<String, Object>> list = new LinkedList<>();
        combinations(jsonToMap, list);

        for (Map<String, Object> combination : list) {
            Gson gson = new GsonBuilder().create();
            String json = gson.toJson(combination);
            System.out.println(json);
        }
    }

    public static <K,V> void combinations( Map<K,Set<V>> map, List<Map<K,V>> list ) {
        recurse( map, new LinkedList<K>( map.keySet() ).listIterator(), new HashMap<K,V>(), list );
    }

    // helper method to do the recursion
    private static <K,V> void recurse( Map<K,Set<V>> map, ListIterator<K> iter, Map<K,V> cur, List<Map<K,V>> list ) {
        // we're at a leaf node in the recursion tree, add solution to list
        if( !iter.hasNext() ) {
            Map<K,V> entry = new HashMap<K,V>();

            for( K key : cur.keySet() ) {
                entry.put( key, cur.get( key ) );
            }

            list.add( entry );
        } else {
            K key = iter.next();
            Set<V> set = map.get( key );

            for( V value : set ) {
                cur.put( key, value );
                recurse( map, iter, cur, list );
                cur.remove( key );
            }

            iter.previous();
        }
    }
}
