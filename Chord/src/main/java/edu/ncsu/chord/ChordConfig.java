package edu.ncsu.chord;

import java.lang.reflect.Array;
import java.net.InetAddress;
import java.util.ArrayList;

/**
 * Created by amit on 23/2/17.
 */
class ChordConfig {

  /* Depending on CHORD_ID_MAX_BITS in each ChordID will be calculated. This is also used in finger table */
  static int CHORD_ID_MAX_BITS = 10;

  /* Number of maximum entries to keep in successor list */
  static int SUCCESSOR_LIST_MAX_SIZE = 3;

  /* ArrayList of IPs of all bootstrap nodes */
  static ArrayList<InetAddress> bootstrapNodes = null;

}
