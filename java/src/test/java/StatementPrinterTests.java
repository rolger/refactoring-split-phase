import static org.approvaltests.Approvals.verify;

import java.util.Arrays;

import org.approvaltests.reporters.JunitReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

@UseReporter(JunitReporter.class)
public class StatementPrinterTests {

    @Test
    public void exampleStatement() {
        Invoice invoice = new Invoice("BigCo", Arrays.asList(
                new Performance(new Play("Hamlet", "tragedy"), 55),
                new Performance(new Play("As You Like It", "comedy"), 35),
                new Performance(new Play("Othello", "tragedy"), 40)));

        StatementPrinter theatricalPlayers = new StatementPrinter();
        String result = theatricalPlayers.print(invoice);

        verify(result);
    }
}
