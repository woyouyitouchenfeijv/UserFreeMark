package com.apps.use;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author w y y t c f j
 * @Description IPTest
 * @Date 2023/6/29
 */
public class IPTest {


    public static void main(String[] args) {
        PrefixTree prefixTree = new PrefixTree();
        prefixTree.insertAddress("192.168.0.1");
        prefixTree.insertAddress("192.168.0.*");


        System.out.println(prefixTree.searchAddress("192.168.0.1")); // Output: true
        System.out.println(prefixTree.searchAddress("192.168.0.5")); // Output: true
        System.out.println(prefixTree.searchAddress("192.168.1.1")); // Output: false
    }



}

class TrieNode {
    boolean isEndOfAddress;
    Map<String, TrieNode> children;

    public TrieNode() {
        isEndOfAddress = false;
        children = new HashMap<>();
    }
}

class PrefixTree {
    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    public void insertAddress(String ipAddress) {
        String[] parts = ipAddress.split("\\.");
        TrieNode current = root;

        for (String part : parts) {
            if (!current.children.containsKey(part)) {
                current.children.put(part, new TrieNode());
            }
            current = current.children.get(part);
        }

        current.isEndOfAddress = true;
    }

    public boolean searchAddress(String ipAddress) {
        String[] parts = ipAddress.split("\\.");
        TrieNode current = root;

        for (String part : parts) {
            if (current.children.containsKey(part)) {
                current = current.children.get(part);
            } else if (current.children.containsKey("*")) {
                current = current.children.get("*");
            } else {
                return false;
            }
        }

        return current.isEndOfAddress;
    }
}