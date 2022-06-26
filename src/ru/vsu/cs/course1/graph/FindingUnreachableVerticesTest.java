package ru.vsu.cs.course1.graph;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.vsu.cs.util.ReadingUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class FindingUnreachableVerticesTest {
   /* private String inputFile;
    private  String outputFile;

    public void FindingUnreachableVertices(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    @Parameterized.Parameters
    public static List<String[]> cases() {
        return Arrays.asList(new String[]{"couse1/tests/input.txt", "couse1/tests/output.txt"},
                new String[]{"couse1/tests/input1.txt", "couse1/tests/output1.txt"},
                new String[]{"couse1/tests/input2.txt", "couse1/tests/output2.txt"},
                new String[]{"couse1/tests/input3.txt", "couse1/tests/output3.txt"},
                new String[]{"couse1/tests/input4.txt", "couse1/tests/output4.txt"});
    }

    @Test
    public void findUnreachableVertices() throws IOException, InstantiationException, IllegalAccessException {
        Graph graph = GraphUtils.fromStr(ReadingUtils.readNumbersFromFile(inputFile));
        AtomicBoolean first = new AtomicBoolean(true);

        FindingUnreachableVertices findingUnreachableVertices = new FindingUnreachableVertices(graph);
        ArrayList<Integer> list = FindingUnreachableVertices.findUnreachableVertices(graph, 0, v -> {
            System.out.print(first.get() ? "" : ", ");
            first.set(false);
        });

        String resultOfTest = list.toString();
        String correctResult = ReadingUtils.readNumbersFromFile(outputFile);

        Assert.assertEquals(resultOfTest, correctResult);
    }*/

    @Test
    public void testFindingUnreachableVertices() throws IOException, InstantiationException, IllegalAccessException {
        String inputGraphStr = "13\n" +
                "13 0\n" +
                "5 4\n" +
                "3 0\n" +
                "1 9\n" +
                "12 6\n" +
                "4 5\n" +
                "4 0\n" +
                "2 11\n" +
                "12 9\n" +
                "10 0\n" +
                "6 7\n" +
                "8 9\n" +
                "11 5\n" +
                "3";
        int numberOfSpecifiedVertex = 0;
        AtomicBoolean first = new AtomicBoolean(true);
        Graph graph = GraphUtils.fromStr(inputGraphStr);
        ArrayList<Integer> list = FindingUnreachableVertices.findUnreachableVertices(graph, numberOfSpecifiedVertex, v -> {
            System.out.print(first.get() ? "" : ", ");
            first.set(false);
            System.out.print(v);
        });

        ArrayList<Integer> resultOfTest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultOfTest.add(list.get(i));
        }
        ArrayList<Integer> correctResult = new ArrayList<>();
        correctResult.add(7);
        correctResult.add(8);
        correctResult.add(9);
        correctResult.add(10);
        correctResult.add(11);
        correctResult.add(12);

        Assert.assertEquals(resultOfTest, correctResult);
    }

    @Test
    public void testFindingUnreachableVertices1() throws IOException, InstantiationException, IllegalAccessException {
        String inputGraphStr = "81\n" +
                "11\n" +
                "0 1\n" +
                "2 3\n" +
                "2 46\n" +
                "20 5\n" +
                "23 7\n" +
                "37 4\n" +
                "3 51\n" +
                "3 7\n" +
                "4 5\n" +
                "40 7\n" +
                "5 78";
        int numberOfSpecifiedVertex = 0;
        AtomicBoolean first = new AtomicBoolean(true);
        Graph graph = GraphUtils.fromStr(inputGraphStr);
        ArrayList<Integer> list = FindingUnreachableVertices.findUnreachableVertices(graph, numberOfSpecifiedVertex, v -> {
            System.out.print(first.get() ? "" : ", ");
            first.set(false);
            System.out.print(v);
        });

        ArrayList<Integer> resultOfTest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultOfTest.add(list.get(i));
        }
        ArrayList<Integer> correctResult = new ArrayList<>();
        correctResult.add(2);
        correctResult.add(3);
        correctResult.add(4);
        correctResult.add(5);
        correctResult.add(6);
        correctResult.add(7);
        correctResult.add(8);
        correctResult.add(9);
        correctResult.add(10);

        Assert.assertEquals(resultOfTest, correctResult);
    }

    @Test
    public void testFindingUnreachableVertices2() throws IOException, InstantiationException, IllegalAccessException {
        String inputGraphStr = "6\n" +
                "2 4\n" +
                "9 23\n" +
                "10 7\n" +
                "55 9\n" +
                "1 23\n" +
                "7 7\n" +
                "8 3";
        int numberOfSpecifiedVertex = 0;
        AtomicBoolean first = new AtomicBoolean(true);
        Graph graph = GraphUtils.fromStr(inputGraphStr);
        ArrayList<Integer> list = FindingUnreachableVertices.findUnreachableVertices(graph, numberOfSpecifiedVertex, v -> {
            System.out.print(first.get() ? "" : ", ");
            first.set(false);
            System.out.print(v);
        });

        ArrayList<Integer> resultOfTest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultOfTest.add(list.get(i));
        }
        ArrayList<Integer> correctResult = new ArrayList<>();
        correctResult.add(1);

        Assert.assertEquals(resultOfTest, correctResult);
    }

    @Test
    public void testFindingUnreachableVertices3() throws IOException, InstantiationException, IllegalAccessException {
        String inputGraphStr = "9\n" +
                "3\n" +
                "2 56\n" +
                "4 8\n" +
                "7\n" +
                "6 14\n" +
                "10 1\n" +
                "55 7";
        int numberOfSpecifiedVertex = 0;
        AtomicBoolean first = new AtomicBoolean(true);
        Graph graph = GraphUtils.fromStr(inputGraphStr);
        ArrayList<Integer> list = FindingUnreachableVertices.findUnreachableVertices(graph, numberOfSpecifiedVertex, v -> {
            System.out.print(first.get() ? "" : ", ");
            first.set(false);
            System.out.print(v);
        });

        ArrayList<Integer> resultOfTest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultOfTest.add(list.get(i));
        }
        ArrayList<Integer> correctResult = new ArrayList<>();
        correctResult.add(1);
        correctResult.add(2);

        Assert.assertEquals(resultOfTest, correctResult);
    }

    @Test
    public void testFindingUnreachableVertices4() throws IOException, InstantiationException, IllegalAccessException {
        String inputGraphStr = "1 4\n" +
                "0\n" +
                "2\n" +
                "5 12\n" +
                "2 3\n" +
                "5\n" +
                "66 7\n" +
                "9 8";
        int numberOfSpecifiedVertex = 4;
        AtomicBoolean first = new AtomicBoolean(true);
        Graph graph = GraphUtils.fromStr(inputGraphStr);
        ArrayList<Integer> list = FindingUnreachableVertices.findUnreachableVertices(graph, numberOfSpecifiedVertex, v -> {
            System.out.print(first.get() ? "" : ", ");
            first.set(false);
            System.out.print(v);
        });

        ArrayList<Integer> resultOfTest = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultOfTest.add(list.get(i));
        }
        ArrayList<Integer> correctResult = new ArrayList<>();
        correctResult.add(0);
        correctResult.add(1);
        correctResult.add(2);
        correctResult.add(3);

        Assert.assertEquals(resultOfTest, correctResult);
    }
}
