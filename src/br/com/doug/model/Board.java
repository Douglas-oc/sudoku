package br.com.doug.model;

import java.util.Collection;
import java.util.List;

import static br.com.doug.model.GameStatusEnum.*;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Board {

    private final List<List<Space>> spaces;

    public Board(final List<List<Space>> spaces) {
        this.spaces = spaces;
    }

    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public GameStatusEnum getStatus(){
        if (spaces.stream()
                .flatMap(Collection::stream) // entra em List<List<Space>> e pega os elementos da List<Space>
                .noneMatch(s -> !s.isFixed() && nonNull(s.getActual()))) // verifica se o espaço NÃO está fixo ou se não é nulo
        {
            return NON_STARTED;
        }

        return spaces.stream().flatMap(Collection::stream).anyMatch(s-> isNull(s.getActual())) ? INCOMPLETE : COMPLETE;
    }   // retorna 'Incompleto' se algum espaço estiver nulo, caso contrario o jogo foi finalizado

    public boolean hasErrors(){
        if (getStatus() == NON_STARTED){
            return false; // não tem como ter erros se o jogo nao começou ainda
        }

        return spaces.stream().flatMap(Collection::stream)
                .anyMatch(s ->  nonNull(s.getActual()) && !s.getActual().equals(s.getExpected()));
        // verifica se o espaço atual não é nulo E se o espaço atual é diferente do esperado, caso os dois seja verdade há um erro
    }

    public boolean changeValue(final int col, final int row, final int value){
        var space = spaces.get(col).get(row);
        if (space.isFixed()) {
            return false;
        }

        space.setActual(value);
        return true;
    }

    public boolean clearValue(final int col, final int row) {
        var space = spaces.get(col).get(row);
        if (space.isFixed()){
            return false;
        }

        space.clearSpace();
        return true;
    }

    public void reset(){
        spaces.forEach(c -> c.forEach(Space::clearSpace));
    }

    public boolean gameIsFinished(){
        return !hasErrors() && getStatus().equals(COMPLETE);
    }


}
