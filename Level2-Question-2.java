
           final Queue<Integer> queue0 = new LinkedList<Integer>(); // if num % 3 == 0, store num in queue0.
       final Queue<Integer> queue1 = new LinkedList<Integer>(); // if num % 3 == 1, store num in queue1.
       final Queue<Integer> queue2 = new LinkedList<Integer>(); // if num % 3 == 2, store num in queue2.

       Arrays.sort(a);

       int sum = 0;
       for (int i = 0; i < a.length; i++) {
           sum = sum + a[i];

           int remainder = a[i] % 3;

           if (remainder == 0) {
               queue0.add(a[i]);
           } else if (remainder == 1) {
               queue1.add(a[i]);
           } else {
               queue2.add(a[i]);
           }
       }

       if (sum % 3 == 1) {
           if (!queue1.isEmpty()) {
               queue1.remove();
           } else {
               if (!queue2.isEmpty()) {
                   queue2.remove();
               } else {
                   System.out.println("0");
               }
               if (!queue2.isEmpty()) {
                   queue2.remove();
               } else {
                   System.out.println("0");
               }
           }
       } else if (sum % 3 == 2) {
           if (!queue2.isEmpty()) {
               queue2.remove();
           } else {
               if (!queue1.isEmpty()) {
                   queue1.remove();
               } else {
                   System.out.println("0");
               }
               if (!queue1.isEmpty()) {
                   queue1.remove();
               } else {
                   System.out.println("0");
               }
           }
       }

       final List<Integer> list = new ArrayList<Integer>();
       list.addAll(queue0);
       list.addAll(queue1);
       list.addAll(queue2);

       Collections.sort(list);

       int result = 0;
       int pow = 1;
       for (int i = 0; i < list.size(); i++) {
           result = result + pow * list.get(i);
           pow = pow * 10;
       }

       System.out.println(result);