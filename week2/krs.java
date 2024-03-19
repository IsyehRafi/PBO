

public class krs {
    String[] matakuliah = new String[5];
    int[] sks = new int[5];
    int totalsks = 0;

    public void setMataKuliah(String matkul, int index) {
        matakuliah[index] = matkul;
    }

    public void setSks(int kredit, int index) {
        sks[index] = kredit;
    }

    public int sumOfSks() {
        int sum = 0;
        for (int i = 0; i < sks.length; i++) {
            sum += sks[i];
        }
        totalsks = sum; // Update totalsks field
        return sum;
    }

    public void infoKrs() {
        for (int i = 0; i < getArraySize(matakuliah); i++) {
            System.out.println("Nama Mata Kuliah : " + matakuliah[i] + " SKS: " + sks[i]);
        }
        totalsks = sumOfSks(); // Update totalsks with the returned sum
        System.out.println("Total SKS: " + totalsks);
    }

    public int getArraySize(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count; // Return the size of the array
    }
}