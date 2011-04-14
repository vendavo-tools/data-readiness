package com.cajhughes.ready.controller;

import com.cajhughes.ready.model.Options;
import com.cajhughes.ready.model.ProcessorProgress;
import com.cajhughes.ready.processor.AttributeProcessor;
import java.util.List;
import javax.swing.JTextField;

public class StatusAttributeProcessor extends AttributeProcessor {
    private JTextField status;

    public StatusAttributeProcessor(final JTextField status, final Options options) {
        super(options);
        this.status = status;
    }

    @Override
    protected void process(List<ProcessorProgress> lines) {
        ProcessorProgress last = lines.get(lines.size()-1);
        status.setText("Processed " + last.getLinesProcessed() + " lines of " + last.getFile().getAbsolutePath());
    }
}
