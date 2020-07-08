public class HashTable {
    private DataItem[] hashArray;
    private int arraysize;
    private DataItem nonItem;

    public HashTable(int arraysize) {
        this.arraysize = arraysize;
        hashArray = new DataItem[arraysize];
        nonItem = new DataItem(-1);
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < arraysize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }

        System.out.println("");
    }

    public int hashFunc(int key) {
        return key % arraysize;
    }

    public void insert(DataItem item) {
        int key = item.getKey();
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {
            ++hashVal;
            hashVal %= arraysize;
        }

        hashArray[hashVal] = item;
    }

    public DataItem delete(int key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {

            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }

            ++hashVal;
            hashVal %= arraysize;
        }

        return null;
    }

    public DataItem find(int key) {
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null) {

            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }

            ++hashVal;
            hashVal %= arraysize;
        }

        return null;
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        int aKey1 = 7 * 10 * 10;
        DataItem dataItem1 = new DataItem(aKey1);
        hashTable.insert(dataItem1);

        int aKey2 = 3 * 10 * 10;
        DataItem dataItem2 = new DataItem(aKey2);
        hashTable.insert(dataItem2);

        int aKey3 = 5 * 10 * 10;
        DataItem dataItem3 = new DataItem(aKey3);
        hashTable.insert(dataItem3);

        hashTable.displayTable();
    }
}
